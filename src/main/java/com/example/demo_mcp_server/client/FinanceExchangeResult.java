package com.example.demo_mcp_server.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FinanceExchangeResult(@JsonProperty("error_code") Integer errorCode,
                                    @JsonProperty("resultcode") String resultCode,
                                    String reason,
                                    List<Map<String, Result>> result) {


    public record Result(String date,
                         String fBuyPri,
                         String bankConversionPri,
                         String name,
                         String time) {}
}
