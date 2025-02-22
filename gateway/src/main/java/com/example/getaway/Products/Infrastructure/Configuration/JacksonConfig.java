package com.example.getaway.Products.Infrastructure.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.getaway.Products.Infrastructure.Base64Deserializer;
import com.example.getaway.Products.Infrastructure.Base64Serializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

@Configuration
public class JacksonConfig {
    
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(byte[].class, new Base64Serializer());
        module.addDeserializer(byte[].class, new Base64Deserializer());
        objectMapper.registerModule(module);
        return objectMapper;
    }
}
