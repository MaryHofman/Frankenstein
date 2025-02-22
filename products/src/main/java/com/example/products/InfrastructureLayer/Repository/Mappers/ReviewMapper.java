package com.example.products.InfrastructureLayer.Repository.Mappers;

import com.example.products.DomanianLayer.Entityes.ProductReview;
import com.example.products.InfrastructureLayer.Entity.Review;

public class ReviewMapper {

    public static Review toEntity(ProductReview review){
        Review converting = new Review(null,review.getUserId(), review.getProductId(), review.getComment(), review.getRating(), review.getCreatedAt());
        return converting;

    }
    
}
