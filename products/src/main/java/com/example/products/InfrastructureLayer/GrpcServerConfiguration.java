package com.example.products.InfrastructureLayer;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.BindableService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.shared.ConfirmationOfAvailabilityGrpc;
import com.example.cartProto.ProductServiceGrpc.ProductServiceImplBase;

@Configuration
public class GrpcServerConfiguration {

    @Autowired
    private ConfirmationOfAvailabilityGrpc.ConfirmationOfAvailabilityImplBase confirmationService;

    @Autowired
    private ProductServiceImplBase productService;  

    @Bean
    public Server grpcServer() throws IOException {
        Server server = ServerBuilder.forPort(9094)
                .addService(confirmationService) 
                .addService(productService) 
                .build()
                .start();
        return server;
    }
}
