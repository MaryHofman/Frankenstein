package com.example.products.InfrastructureLayer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.shared.ConfirmationOfAvailabilityGrpc;
import com.example.shared.gRPCserviceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Configuration
public class GrpcConfig {

    @Bean
    public ManagedChannel managedChannelFile() {
         return ManagedChannelBuilder.forAddress("localhost", 9090)
        //   return ManagedChannelBuilder.forAddress("fileMicroservice", 9090)
                .usePlaintext()
                .build();
    }

    @Bean
    public ManagedChannel managedChannelCart() {
        return ManagedChannelBuilder.forAddress("cart", 9091)
                .usePlaintext()
                .build();
    }

    @Bean
    public gRPCserviceGrpc.gRPCserviceBlockingStub gRPCserviceBlockingStub(@Qualifier("managedChannelFile") ManagedChannel channel) {
        return gRPCserviceGrpc.newBlockingStub(channel);
    }

    @Bean
    public ConfirmationOfAvailabilityGrpc.ConfirmationOfAvailabilityBlockingStub cartServiceBlockingStub(@Qualifier("managedChannelCart") ManagedChannel cartChannel) {
        return ConfirmationOfAvailabilityGrpc.newBlockingStub(cartChannel);
    }
}
