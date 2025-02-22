package com.example.cart.InfrastructureLayer.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.cart.ApplicationLayer.Cart.CartService;

@Configuration
public class BeanConfigurations {

    @Bean
    public CartService cartService(){
        return new CartService();
    }
    
}
