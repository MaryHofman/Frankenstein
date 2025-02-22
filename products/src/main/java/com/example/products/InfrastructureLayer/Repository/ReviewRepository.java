package com.example.products.InfrastructureLayer.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.products.DomanianLayer.Entityes.ProductReview;
import com.example.products.InfrastructureLayer.Entity.Review;
import com.example.products.InfrastructureLayer.Repository.Mappers.ReviewMapper;

@Repository
public class ReviewRepository {

    @Autowired
    private JpaReviewRepository jpaReviewRepository;
    
    public Review addReview(ProductReview review){
        Review newReview = ReviewMapper.toEntity(review);
        return jpaReviewRepository.save(newReview);
    }

    public String deleteReview(Long reviewId){
        jpaReviewRepository.deleteById(reviewId);
        return "Комментарий удален";
    }

    public List<Review> takeProductReview(Long productId){

        List<Review> reviewsOfProduct = jpaReviewRepository.findAllByProductId(productId);
        return reviewsOfProduct;
    }
}
