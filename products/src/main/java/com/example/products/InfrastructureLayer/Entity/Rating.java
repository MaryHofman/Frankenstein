package com.example.products.InfrastructureLayer.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Rating")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rating{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  

    @Column(name = "user_id", nullable = false)
    private Long user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Products product;

    @Column(name = "rating_value")
    private Short rating; 

    @Column(name = "comment")
    private String comment; 

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt; 
}

