package com.example.cart.DomanianLayer.Entyties.Cart;

public class CartItem {

    private Long id;
    private Long cartId;
    private Long userId;
    private Long productId;
    private int quantity;
    private boolean isPurchased;
    
    
   
    public CartItem(Long id, Long cartId, Long userId, Long productId, int quantity) {
        this.id = id;
        this.cartId = cartId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }
    
    public CartItem(Long cartId, Long userId, Long productId, int quantity) {
        this.cartId = cartId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCartId() {
        return cartId;
    }
    public void setCartId(Long cartId) {
        this.cartId = cartId;
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
    public boolean isPurchased() {
        return isPurchased;
    }
    public void setPurchased(boolean isPurchased) {
        this.isPurchased = isPurchased;
    } 

}
