package com.example.cart.InfrastructureLayer;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.cart.AdaptersLayer.CartGRPCService;

import java.io.IOException;

@Configuration
public class GrpcServerConfig {

    

    @Autowired
    private CartGRPCService cartGRPCService;


    @Bean
    public Server grpcServer() throws IOException {
        return ServerBuilder.forPort(9091) 
                .addService(cartGRPCService)
                .build()
                .start();
    }

   
}
