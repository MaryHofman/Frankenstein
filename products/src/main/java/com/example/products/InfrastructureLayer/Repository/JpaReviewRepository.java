package com.example.products.InfrastructureLayer.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.products.InfrastructureLayer.Entity.Review;

@Repository
public interface JpaReviewRepository extends JpaRepository<Review, Long> {

	List<Review> findAllByProductId(Long productId);
    
}
