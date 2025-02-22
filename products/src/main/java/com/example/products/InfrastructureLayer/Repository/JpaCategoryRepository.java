package com.example.products.InfrastructureLayer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.products.InfrastructureLayer.Entity.Category;

@Repository
public interface JpaCategoryRepository extends JpaRepository<Category, Long> {

    Category findByUrl(String type);

    
}
