package com.example.getaway.Products.Adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.getaway.Products.Application.ReviewService;
import com.example.getaway.Products.Application.DTO.in.ProductReviewRequest;
import com.example.getaway.Products.Application.DTO.in.Review;

import reactor.core.publisher.Mono;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewServices;

    // Создание отзыва
    @PostMapping("/product/review/create")
    public Mono<?> createReview(@RequestBody ProductReviewRequest review, @RequestHeader("Authorization") String accessToken) {
        return reviewServices.createReview(review, accessToken);
    }

    // Удаление отзыва
    @DeleteMapping("/product/review/delete/{reviewId}")
    public Mono<?> deleteReview(@PathVariable Long reviewId) {
        return reviewServices.deleteReview(reviewId)
                .map(result -> new ResponseEntity<>(result, HttpStatus.OK));
    }

    // Получение всех отзывов по продукту
    @GetMapping("/product/review/get/{productId}")
    public Mono<?> getAllReviews(@PathVariable Long productId) {
        return reviewServices.getAllReviews(productId)
                .map(reviews -> new ResponseEntity<>(reviews, HttpStatus.OK));
    }
}
