package com.example.products.ApplicationLayer.Services;

import com.example.products.ApplicationLayer.DTO.in.CreateProductDTO;
import com.example.products.ApplicationLayer.DTO.in.ProductCheck;
import com.example.products.ApplicationLayer.DTO.in.ProductDTO;
import com.example.shared.ConfirmationOfAvailabilityGrpc;
import com.example.shared.Service.ConfirmationOfAvailabilityRequest;
import com.example.shared.Service.ConfirmationOfAvailabilityResponse;
import com.example.shared.Service.Product;
import com.google.protobuf.Empty;

import io.grpc.stub.StreamObserver;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfirmationOfAvailabilityService extends ConfirmationOfAvailabilityGrpc.ConfirmationOfAvailabilityImplBase {
    @Autowired
    private ProductsService productService;

    
    @Override
    public void check(ConfirmationOfAvailabilityRequest request, StreamObserver<ConfirmationOfAvailabilityResponse> responseObserver) {
        ConfirmationOfAvailabilityResponse.Builder responseBuilder = ConfirmationOfAvailabilityResponse.newBuilder();
        List<Product> products = request.getProductsList();
        List<Product> checkProducts = productService.check(products);
        BigDecimal sum = productService.takeSum(checkProducts);
        responseBuilder.addAllProducts(checkProducts);
        responseBuilder.setSum(String.valueOf(sum));
        ConfirmationOfAvailabilityResponse response = responseBuilder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
   
   }
