package com.example.getaway.Products.Adapters.Convertors;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import org.springframework.web.multipart.MultipartFile;
import com.example.getaway.Products.Application.DTO.in.ProductDTO;
import com.example.getaway.Products.Application.DTO.in.UpdateProductRequest;


public class toProductDTO {

    public static ProductDTO convert(UpdateProductRequest updateRequest, MultipartFile mainFile, List<MultipartFile> files) throws IOException{
        List<String> listBytesImages = new ArrayList<>();
        
        if(files!=null && !files.isEmpty()){
            listBytesImages=  files.stream()
            .map(e -> {
                try {
                    return Base64.getEncoder().encodeToString(e.getBytes());
                } catch (IOException e1) {
                    e1.printStackTrace();
                    return "";
                }
            })
            .collect(Collectors.toList()) ; }
        
        ProductDTO product = new ProductDTO.Builder()
        .id(updateRequest.getId())
        .name(updateRequest.getName())
        .mainImage(mainFile!=null ? Base64.getEncoder().encodeToString(mainFile.getBytes()):null)
        .listImages(listBytesImages)
        .colors(updateRequest.getColors())
        .characteristics(updateRequest.getCharacteristics())
        .price(updateRequest.getPrice())
        .discount(updateRequest.getDiscount())
        .type(updateRequest.getType())
        .quantity(updateRequest.getQuantity())
        .description(updateRequest.getDescription())
        .nameCtegory(null)
        .build();

                
        return null;
    }
    
}
