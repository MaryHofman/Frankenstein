package com.example.cart.ApplicationLayer.Cart.DTO;


public class AddProduct{
    private Long userId;
    private Long productId;
    private int quantity;

    public AddProduct() {
    }
    
    
    public AddProduct(Long userId, Long productId, int quantity) {
        this.userId = userId;
        this.productId = productId;
        this.quantity=quantity;
    }

    

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    @Override
    public String toString(){
        return " "+this.quantity +"  "+this.userId+"  "+this.productId;
    }

    
}