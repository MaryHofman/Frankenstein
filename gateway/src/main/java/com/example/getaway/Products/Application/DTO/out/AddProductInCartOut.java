package com.example.getaway.Products.Application.DTO.out;

public class AddProductInCartOut {
    private Long productId;
    private Long userId;
    private int quantity;

    public AddProductInCartOut() {
    }

    

    public AddProductInCartOut(Long productId, Long userId, int quantity) {
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
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
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }


}
