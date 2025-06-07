package com.example.demo_mcp_server.client;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

public interface ApiClient {

    @GetExchange("/exchange/rmbquot")
    FinanceExchangeResult getFinanceExchange(@RequestParam("key") String key);

}
