package com.example.cart.ApplicationLayer.Cart;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.cart.ApplicationLayer.Cart.DTO.AddProduct;
import com.example.cart.ApplicationLayer.Cart.DTO.ProductDTO;
import com.example.cart.DomanianLayer.Entyties.Cart.Cart;
import com.example.cart.DomanianLayer.Entyties.Cart.CartItem;
import com.example.cart.DomanianLayer.UseCases.CartUseCases;
import com.example.cart.InfrastructureLayer.Repositoryes.Cart.CartRepository;

public class CartService implements CartUseCases<AddProduct> {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart createCart(Long userId) {
        Cart newCart = new Cart(userId, LocalDateTime.now());
        return cartRepository.saveNewCart(newCart);
    }

    @Override
    public String addItemToCart(AddProduct product) {
        Cart userCart = cartRepository.findByUserId(product.getUserId());
  
        if(userCart == null){
            createCart(product.getUserId());
            userCart= cartRepository.findByUserId(product.getUserId());
        }

        System.out.println(userCart.toString());
        CartItem addProductInCart = new CartItem(userCart.getId(), product.getUserId(), product.getProductId(), product.getQuantity());
        cartRepository.saveCartItem(addProductInCart);

        return "Товар добавлен";
    }

    @Override
    public String removeItemFromCart(Long userId, Long productId) {
        Cart userCart = cartRepository.findByUserId(userId);
        cartRepository.deleteCartItem(userCart.getId(), productId);
        return "Товар успешно удален";

    }

    @Override
    public CartItem updateItemQuantity(Long userId, Long productId, int quantity) {
        Cart userCart = cartRepository.findByUserId(userId);
        return cartRepository.updateItemQuantity(userCart.getId(), productId, quantity);
    }

    @Override
    public List<CartItem> getItemsInCart(Long userId) {
        Cart userCart = cartRepository.findByUserId(userId);
        return cartRepository.getItemsInCart(userCart.getId());
    }

    @Override
    public String cleanCart(List<Long> productsId, Long userId){
        return "Корзина отчищена";
    }

    @Override
    public String deleteCart(Long userId) {
        Cart userCart = cartRepository.findByUserId(userId);
        cartRepository.deleteCart(userCart.getId());
        return "Корзина пользователя удалена";
    }



}
