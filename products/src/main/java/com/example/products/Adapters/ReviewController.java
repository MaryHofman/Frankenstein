package com.example.products.Adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.products.ApplicationLayer.Services.ReviewServices;
import com.example.products.DomanianLayer.Entityes.ProductReview;
import com.example.products.InfrastructureLayer.Entity.Review;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    private ReviewServices reviewServices;


    @PostMapping("/product/review/create")
    public ResponseEntity<Review> createReview(@RequestBody ProductReview review) {
        Review addedReview = reviewServices.createReview(review);
        return new ResponseEntity<>(addedReview, HttpStatus.CREATED);
    }

    @DeleteMapping("/product/review/delete/{reviewId}")
    public ResponseEntity<String> deleteReview(@PathVariable Long reviewId) {
        String result = reviewServices.deleteReview(reviewId);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/product/review/get/{productId}")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long productId) {
        List<Review> reviews = reviewServices.takeAllReview(productId);
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }
}
