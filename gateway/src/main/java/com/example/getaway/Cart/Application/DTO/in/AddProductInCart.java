package com.example.getaway.Cart.Application.DTO.in;

public class AddProductInCart {
    private Long productId;
    private int quantity;

    
    public AddProductInCart() {
    }

    

    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    
}
