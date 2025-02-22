package com.example.getaway.Products.Application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.getaway.ApplicationLayer.DTO.ProductCheck;
import com.example.getaway.Products.Application.DTO.in.CreateCategoryRequest;
import com.example.getaway.Products.Application.DTO.in.CreateProductDTO;
import com.example.getaway.Products.Application.DTO.in.CreateProductRequest;
import com.example.getaway.Products.Application.DTO.in.ProductDTO;
import com.example.getaway.Products.Application.DTO.in.ProductReviewRequest;
import com.example.getaway.Products.Application.DTO.in.Review;
import com.example.getaway.Products.Application.DTO.out.CreateCategoryResponse;
import com.example.getaway.Products.Application.DTO.out.ProductReviewResponse;
import com.example.getaway.Products.Application.Mappers.ProductReviewMapper;
import com.example.getaway.Products.Application.Mappers.ToCreateProductRequest;
import com.example.getaway.Security.ApplicationLayer.UserService;

import reactor.core.publisher.Mono;

import com.example.getaway.ApplicationLayer.DTO.PrepareForOrderDTO;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    public WebClient webClientProduct;

    @Autowired
    public UserService userService;


    public Mono<CreateProductRequest> createProduct(CreateProductDTO product, List<MultipartFile> files,
        MultipartFile mainFile) throws IOException {
            CreateProductRequest productRequest = ToCreateProductRequest.toCreateProductRequest(product, files, mainFile);
          
            return webClientProduct.post()
                .uri("/product/create")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(productRequest)
                .retrieve()
                .bodyToMono(CreateProductRequest.class);}



    public Mono<?> getProductsByType(String type, int page, int size ) {

        return webClientProduct.get()
            .uri(uriBuilder -> uriBuilder
                    .path("/product/get/type/{type}")
                    .queryParam("page", page)
                    .queryParam("size", size)
                    .build(type))
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<List<ProductDTO>>() {});
    }
    

    public Mono<ProductDTO> getProductById(Long id) {
        return webClientProduct.get()
                .uri("/product/get/id/{id}", id) 
                .retrieve()
                .bodyToMono(ProductDTO.class);
    }

    public Mono<?> getAllProducts(int page, int size) {
       
        return webClientProduct.get()
                .uri("/product/get/all", page, size) 
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<ProductDTO>>() {});
    }

    public Mono<String> deleteById(Long id) {
        
        return webClientProduct.delete()
        .uri("/product/delete/{id}", id)
        .retrieve()
        .bodyToMono(String.class);
    }

    public Mono<ProductDTO> updateProduct(ProductDTO convertProduct) {
        return webClientProduct.put()
            .uri("/product/update/")
            .bodyValue(convertProduct)
            .retrieve()
            .bodyToMono(ProductDTO.class);
    }



    public Mono<List<String>> getProductsTypes() {
        return webClientProduct.get()
        .uri("/product/types/products")
        .retrieve()
        .bodyToMono(new ParameterizedTypeReference<List<String>>() {});
    }



    public Mono<CreateCategoryResponse> createCategory(CreateCategoryRequest createCategory) {
        return webClientProduct.post()
        .uri("/product/create/category")
        .bodyValue(createCategory)
        .retrieve()
        .bodyToMono(CreateCategoryResponse.class);
    }



    public Mono<List<CreateCategoryResponse>> getCategories() {
        return webClientProduct.get()
        .uri("/product/get/categories")
        .retrieve()
        .bodyToMono(new ParameterizedTypeReference<List<CreateCategoryResponse>>() {});
    }



    public Mono<String> deleteCategory(Long id) {
        return webClientProduct.delete()
        .uri("/product/delete/category/{id}", id)
        .retrieve()
        .bodyToMono(String.class);
    }



    public Mono<?> getDiscount(int page, int size) {
        return webClientProduct.get()
            .uri(uriBuilder -> uriBuilder
            .path("/product/get/discount")
            .queryParam("page", page)
            .queryParam("size", size)
            .build()) 
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<List<ProductDTO>>() {});
    }



    public Mono<?>  getFilterdProducts(String type, Map<String, String> filteringConditions) {
        return webClientProduct.get()
            .uri(uriBuilder -> uriBuilder
            .path("/product/get/products/filter")
            .queryParam("type", type)
            .queryParam("filteringConditions", filteringConditions)
            .build()) 
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<List<ProductDTO>>() {});
    }
    
}
