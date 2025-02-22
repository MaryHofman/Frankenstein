package com.example.cart.InfrastructureLayer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.cartProto.ProductServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Configuration
public class GrpcClientConfiguration {

    @Bean
    public ManagedChannel mainServiceChannel() {
        return ManagedChannelBuilder.forAddress("products", 9094)
        //  return ManagedChannelBuilder.forAddress("localhost", 9094)
                                    .usePlaintext()
                                    .build();
    } 

    @Bean
    public ProductServiceGrpc.ProductServiceBlockingStub productService(ManagedChannel mainServiceChannel) {
        return ProductServiceGrpc.newBlockingStub(mainServiceChannel);
    }
    
    
}

