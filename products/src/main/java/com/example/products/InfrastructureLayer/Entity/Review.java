package com.example.products.InfrastructureLayer.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Review")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  

   
    @Column(name = "user_id", nullable = false)
    private Long user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Long product;  

    @Column(nullable = false, length = 1000)
    private String text; 

    @Column(nullable = false)
    private int rating; 

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt; 
}
