package com.example.getaway.Products.Application.Mappers;

import java.util.List;
import java.util.stream.Collectors;

import com.example.getaway.Products.Application.DTO.in.ProductReviewRequest;
import com.example.getaway.Products.Application.DTO.in.Review;
import com.example.getaway.Products.Application.DTO.out.ProductReviewResponse;

public class ProductReviewMapper {

    public static ProductReviewResponse toResponse(Review request) {
        ProductReviewResponse response = new ProductReviewResponse();
        response.setId(request.getId());
        response.setProductId(request.getProductId()); 
        response.setRating(request.getRating());
        response.setComment(request.getComment());
        response.setCreatedAt(request.getCreatedAt());
        return response;
    }

    public static Review toRequest(ProductReviewResponse response) {
     Review request = new Review(
            response.getProductId(), 
            response.getId(),
            response.getRating(), 
            response.getComment()
        );
        request.setCreatedAt(response.getCreatedAt());
        return request;
    }

    public static List<ProductReviewResponse> toResponseList(List<Review> requests) {
        return requests.stream()
                .map(ProductReviewMapper::toResponse)
                .collect(Collectors.toList());
    }

    public static List<Review> toRequestList(List<ProductReviewResponse> responses) {
        return responses.stream()
                .map(ProductReviewMapper::toRequest)
                .collect(Collectors.toList());
    }
}

