package com.example.getaway.Products.Application.DTO.out;

import java.time.LocalDateTime;

public class ProductReviewResponse {


        private Long id; 
        private Long productId;  
        private String username;
        private int rating; 
        private String comment; 
        private LocalDateTime createdAt;  
    
    

    
        public Long getId() {
            return id;
        }
    
        public void setId(Long id) {
            this.id = id;
        }
    
        public Long getProductId() {
            return productId;
        }
    
        public void setProductId(Long productId) {
            this.productId = productId;
        }
    
        public String getUsername() {
            return username;
        }
    
        public void setUsername(String username) {
            this.username = username;
        }
    
        public int getRating() {
            return rating;
        }
    
        public void setRating(int rating) {
            this.rating = rating;
        }
    
        public String getComment() {
            return comment;
        }
    
        public void setComment(String comment) {
            this.comment = comment;
        }
    
        public LocalDateTime getCreatedAt() {
            return createdAt;
        }
    
        public void setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
        }
    
    
}
