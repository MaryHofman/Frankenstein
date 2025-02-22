package com.example.products.InfrastructureLayer.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.products.ApplicationLayer.DTO.in.ProductDTO;
import com.example.products.InfrastructureLayer.Entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    Page<Products> findAllByType(String type, Pageable pageable);

    Page<Products> findAll(Pageable pageable);

    @Query("SELECT DISTINCT p.type FROM Products p")
    List<String> findAllDistinctTypes();

    @Query("SELECT p FROM Products p WHERE p.discount IS NOT NULL AND p.discount <> '0'")
    Page<Products> findAllDiscount(Pageable pageable);

    }
