package com.example.products.InfrastructureLayer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.products.InfrastructureLayer.Entity.Rating;

@Repository
public interface JpaRatingRepository extends JpaRepository<Rating, Long> {
    
}