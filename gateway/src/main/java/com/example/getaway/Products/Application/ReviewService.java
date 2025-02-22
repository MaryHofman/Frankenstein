package com.example.getaway.Products.Application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.getaway.Products.Application.DTO.in.ProductReviewRequest;
import com.example.getaway.Products.Application.DTO.in.Review;
import com.example.getaway.Products.Application.DTO.out.ProductReviewResponse;
import com.example.getaway.Products.Application.Mappers.ProductReviewMapper;
import com.example.getaway.Security.ApplicationLayer.UserService;

import reactor.core.publisher.Mono;

public class ReviewService {

    @Autowired
    public WebClient webClientProduct;

    @Autowired
    public UserService userService;

    public Mono<?> createReview(ProductReviewRequest review, String accessToken) {
        Long userId = userService.GetUserId(accessToken);

        review.setUserId(userId);

        return webClientProduct.post()
            .uri("/product/review/create")
            .bodyValue(review)
            .retrieve()
            .bodyToMono(Review.class); }

   
        public Mono<String> deleteReview(Long reviewId) {
                return webClientProduct.delete()
                        .uri("/product/review/delete/{reviewId}", reviewId)
                        .retrieve()
                        .bodyToMono(String.class); 
            }
            

    
    public Mono<List<Review>> getAllReviews(Long productId) {
        return webClientProduct.get()
                .uri("/product/review/get/{productId}", productId)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Review>> (){});
    }
    
    
}
