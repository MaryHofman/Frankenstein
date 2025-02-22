package com.example.products.ApplicationLayer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.products.DomanianLayer.Entityes.ProductReview;
import com.example.products.InfrastructureLayer.Entity.Review;
import com.example.products.InfrastructureLayer.Repository.ReviewRepository;

@Service
public class ReviewServices {
    @Autowired
    private ReviewRepository repository;

    @Autowired
    private ProductsService productsService;

    public Review createReview(ProductReview review){
        Review addedReview = repository.addReview(review);
        return addedReview;
    }


    public String deleteReview(Long rewiewId){
        return repository.deleteReview(rewiewId);
    }



    public List<Review> takeAllReview(Long productId){
        return repository.takeProductReview(productId);
    }

    
    
}
