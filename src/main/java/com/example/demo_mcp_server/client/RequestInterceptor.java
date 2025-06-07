package com.example.demo_mcp_server.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@Slf4j
public class RequestInterceptor implements ClientHttpRequestInterceptor {
    @Override
    public ClientHttpResponse intercept( HttpRequest request,
                                        byte[] body,
                                        ClientHttpRequestExecution execution) throws IOException {
        logRequest(request, body);
        ClientHttpResponse response = execution.execute(request, body);
        logResponse(response);
        return response;
    }

    private void logRequest(HttpRequest request, byte[] body) {
        log.info("Request: {} {}", request.getMethod(), request.getURI());
        if (log.isDebugEnabled()) {
            request.getHeaders()
                   .forEach((name, values) -> values.forEach(value -> log.debug("{}={}", name, value)));
        }
        log.info("Request body: {}", new String(body, StandardCharsets.UTF_8));
    }

    private void logResponse(ClientHttpResponse response) throws IOException {

        log.info("Response Status: {}, {}", response.getStatusCode(), response.getStatusText());

        if (log.isDebugEnabled()) {
            response.getHeaders()
                    .forEach((name, values) -> values.forEach(value -> log.debug("{}={}", name, value)));
        }
        if (response.getStatusCode().is5xxServerError()) {
            InputStreamReader isr = new InputStreamReader(response.getBody(), StandardCharsets.UTF_8);
            String body = new BufferedReader(isr).lines().collect(Collectors.joining("\n"));
            log.info("Response body: {}", body);
        }
    }
}