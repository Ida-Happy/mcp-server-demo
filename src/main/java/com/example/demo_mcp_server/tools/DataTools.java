package com.example.demo_mcp_server.tools;

import com.example.demo_mcp_server.repo.Item;
import com.example.demo_mcp_server.repo.ItemRepository;
import com.example.demo_mcp_server.repo.Order;
import com.example.demo_mcp_server.repo.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Component
public class DataTools {

    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;

    public DataTools(OrderRepository orderRepository, ItemRepository itemRepository) {
        this.orderRepository = orderRepository;
        this.itemRepository = itemRepository;
    }

    @Tool(description = "获取当前系统时间")
    public LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }

    @Tool(description = "检索在指定时间范围内创建的所有订单。")
    public List<Order> getPurchaseOrders(
            @ToolParam(description = "时间范围的起始时间（包含）。") LocalDateTime startTime,
            @ToolParam(description = "时间范围的结束时间（包含）。") LocalDateTime endTime
    ) {
        log.info("Received start time: {}", startTime);
        log.info("Received end time: {}", endTime);
        return orderRepository.findOrdersByCreateTimeBetween(startTime, endTime);
    }

    @Tool(description = "查询商城内已上架商品对应的价格相关信息。价格所用货币为人民币，basePrice为商品的成本价，salePrice为售价，taxRate为商品过海关时的税率。")
    public List<Item> getSellingItems() {
        return itemRepository.findItemByPurchaseFlg(true);
    }
}
