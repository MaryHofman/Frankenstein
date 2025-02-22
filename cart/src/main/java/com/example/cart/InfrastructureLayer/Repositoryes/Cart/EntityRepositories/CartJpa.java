package com.example.cart.InfrastructureLayer.Repositoryes.Cart.EntityRepositories;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "carts") 
public class CartJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false) 
    private Long userId;

    @Column(name = "created_date")
    private LocalDateTime createdDate; 

   
    public CartJpa() {
    }


    public CartJpa(Long userId, LocalDateTime createdDate) {
        this.userId = userId;
        this.createdDate = createdDate;
    }

  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

   
    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userId=" + userId +
                ", createdDate=" + createdDate +
                '}';
    }
}
