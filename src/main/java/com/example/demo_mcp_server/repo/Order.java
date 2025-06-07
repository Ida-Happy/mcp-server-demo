package com.example.demo_mcp_server.repo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table("demo_orders_tbl")
public class Order {
    @Id
    private Integer id;
    private String orderId;
    private String itemId;
    private String itemName;
    private String shopName;
    private Integer purchaseNum;
    private Integer price;
    private LocalDateTime createTime;
}

