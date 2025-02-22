package com.example.cart.DomanianLayer.UseCases;

import java.math.BigDecimal;
import java.util.List;

import com.example.cart.DomanianLayer.Entyties.Cart.Cart;
import com.example.cart.DomanianLayer.Entyties.Cart.CartItem;

public interface CartUseCases<T> {

    Cart createCart(Long userId);

    String addItemToCart( T product);

    String removeItemFromCart(Long cartId, Long productId);

    CartItem updateItemQuantity(Long cartId, Long productId, int quantity);

    List<CartItem> getItemsInCart(Long cartId);

    String cleanCart(List<Long> productsId, Long userId);

    String deleteCart(Long cartId);
}

