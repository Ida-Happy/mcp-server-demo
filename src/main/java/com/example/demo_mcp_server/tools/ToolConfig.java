package com.example.demo_mcp_server.tools;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolConfig {

    @Bean
    public ToolCallbackProvider toolCallbackProvider(DataTools dataTools, ExchangeTools exchangeTools) {
        return ToolCallbackProvider.from(ToolCallbacks.from(dataTools, exchangeTools));
    }

}
