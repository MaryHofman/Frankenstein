package com.example.getaway.Products.Application.Mappers;

import com.example.getaway.Products.Application.DTO.in.CreateProductDTO;
import com.example.getaway.Products.Application.DTO.in.CreateProductRequest;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;

public class ToCreateProductRequest {
    
    public static CreateProductRequest toCreateProductRequest(CreateProductDTO product, List<MultipartFile> files, 
    MultipartFile mainFile) throws IOException{
        List<String> photos = new ArrayList<>();

        for(MultipartFile file : files){
            photos.add(Base64.encodeBase64String(file.getBytes()));
        }

        CreateProductRequest request =  CreateProductRequest.builder()
        .name(product.getName())
        .price(product.getPrice().toString())
        .type(product.getType())
        .quantity(product.getQuantity())
        .discount(product.getDiscount().toString())
        .characteristics(product.getCharacteristics())
        .colors(product.getColors())
        .description(product.getDescription())
        .mainPhoto(Base64.encodeBase64String(mainFile.getBytes()))
        .photos(photos)
        .build();

        return request;
    }
    
}
