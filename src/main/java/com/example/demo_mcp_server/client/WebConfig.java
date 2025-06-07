package com.example.demo_mcp_server.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;


@Configuration
public class WebConfig {

    @Bean
    public ApiClient aliClient(RestClient.Builder restClientBuilder, @Value("${ex.api.url}") String baseUrl) {
        return HttpServiceProxyFactory.builderFor(RestClientAdapter.create(
                        restClientBuilder
                                .baseUrl(baseUrl)
                                .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                                .requestInterceptor(new RequestInterceptor())
                                .build()))
                .build()
                .createClient(ApiClient.class);
    }
}
