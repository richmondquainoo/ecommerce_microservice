package com.example.orderservice.OrderService.config;

import org.springframework.context.annotation.Configuration;


@Configuration
public class WebClientConfig {

    public WebClient webClient(){
        return WebClient.builder().build();
    }


}
