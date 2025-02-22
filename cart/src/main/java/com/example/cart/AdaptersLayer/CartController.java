package com.example.cart.AdaptersLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cart.ApplicationLayer.Cart.CartService;
import com.example.cart.ApplicationLayer.Cart.DTO.AddProduct;
import com.example.cart.DomanianLayer.Entyties.Cart.Cart;
import com.example.cart.DomanianLayer.Entyties.Cart.CartItem;


@RestController
@RequestMapping("/api")

public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/{userId}")
    public ResponseEntity<Cart> createCart(@PathVariable Long userId) {
        Cart newCart = cartService.createCart(userId);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCart);
    }

    // Добавить товар в корзинуы
    @PostMapping("/add")
    public ResponseEntity<String> addItemToCart(@RequestBody AddProduct product) {
        String response = cartService.addItemToCart(product);
        return ResponseEntity.ok(response);
    }

    // Удалить товар из корзины
    @DeleteMapping("/delete/{userId}/items/{productId}")
    public ResponseEntity<String> removeItemFromCart(@PathVariable Long userId, @PathVariable Long productId) {
        String response = cartService.removeItemFromCart(userId, productId);
        return ResponseEntity.ok(response);
    }

    // Обновить количество товара
    @PutMapping("/{userId}/items/{productId}")
    public ResponseEntity<CartItem> updateItemQuantity(
            @PathVariable Long userId,
            @PathVariable Long productId,
            @RequestParam int quantity) {
        CartItem updatedItem = cartService.updateItemQuantity(userId, productId, quantity);
        return ResponseEntity.ok(updatedItem);
    }

    // Получить список товаров в корзине
    @GetMapping("/{userId}/items")
    public ResponseEntity<List<CartItem>> getItemsInCart(@PathVariable Long userId) {
        List<CartItem> items = cartService.getItemsInCart(userId);
        return ResponseEntity.ok(items);
    }

    // Очистить корзину
    @PostMapping("/{userId}/clean")
    public ResponseEntity<String> cleanCart(@RequestBody List<Long> productIds, @PathVariable Long userId) {
        String response = cartService.cleanCart(productIds, userId);
        return ResponseEntity.ok(response);
    }

    // Удалить корзину
    @DeleteMapping("/delete/cart/{userId}")
    public ResponseEntity<String> deleteCart(@PathVariable Long userId) {
        String response = cartService.deleteCart(userId);
        return ResponseEntity.ok(response);
    }

}

