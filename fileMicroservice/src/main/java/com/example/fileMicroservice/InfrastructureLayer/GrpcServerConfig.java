package com.example.fileMicroservice.InfrastructureLayer;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.fileMicroservice.ApplicationLayer.gRPCserviceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

@Configuration
public class GrpcServerConfig {

    @Autowired
    private  gRPCserviceImpl grpcService;

    @Bean
    public Server grpcServer() throws IOException {
        Server server = ServerBuilder.forPort(9090)
                 .maxInboundMessageSize(16 * 1024 * 1024)  
                .addService(grpcService) 
                .build()
                .start();
        System.out.println("gRPC server started on port 9090");
        return server;
    }
}
