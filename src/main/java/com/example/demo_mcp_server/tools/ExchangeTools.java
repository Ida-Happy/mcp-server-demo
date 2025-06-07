package com.example.demo_mcp_server.tools;

import com.example.demo_mcp_server.client.ApiClient;
import com.example.demo_mcp_server.client.FinanceExchangeResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Slf4j
@Component
public class ExchangeTools {

    private final ApiClient apiClient;
    private final String apiKey;

    public ExchangeTools(ApiClient apiClient, @Value("${ex.api.key}") String apiKey) {
        this.apiClient = apiClient;
        this.apiKey = apiKey;
    }

    @Tool(name = "getFinanceExchange",
            description = "获取最新的外汇汇率信息，返回100外币可兑换的人民币数量. 包括货币名称和现汇买入价等数据。适用于需要查询各类货币当前汇率的场景。")
    public List<FinanceExchangeResult.Result> getFinanceExchange() {
        var result = apiClient.getFinanceExchange(apiKey);
        if (!CollectionUtils.isEmpty(result.result())) {
            log.info("Got result from API: {}", result.result());
            return result.result().getFirst().values().stream().toList();
        }
        return null;
    }
}
