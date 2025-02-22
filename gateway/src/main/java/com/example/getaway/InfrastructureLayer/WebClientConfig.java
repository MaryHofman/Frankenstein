package com.example.getaway.InfrastructureLayer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient webClientSecurity(WebClient.Builder builder) {
         return builder.baseUrl("http://securitymicroservice:8080/").build();
       
    }

    @Bean
    public WebClient webClientCart(WebClient.Builder builder) {
        return builder.baseUrl("http://cart:8080/").build();
    }

    @Bean
    public WebClient webClientProduct(WebClient.Builder builder) {
        //  return builder.baseUrl("http://products:8080/").build();
          return builder.baseUrl("http://localhost:8080/").build();
    }

    
}

    

