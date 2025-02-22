package com.example.cart.InfrastructureLayer.Repositoryes.Cart.EntityRepositories;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cart_items")
public class CartItemJpa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cart_id", nullable = false)
    private Long cartId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "is_purchased", nullable = false)
    private boolean isPurchased;

    public CartItemJpa() {
    }

    public CartItemJpa(Long cartId, Long userId, Long productId, int quantity) {
        this.cartId = cartId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.isPurchased = false;
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
