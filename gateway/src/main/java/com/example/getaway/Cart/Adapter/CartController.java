package com.example.getaway.Cart.Adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.getaway.Cart.Application.CartService;
import com.example.getaway.Cart.Application.DTO.in.AddProductInCart;
import com.example.getaway.Cart.Application.DTO.out.CartItem;
import com.example.getaway.Products.Application.ProductService;
import com.example.getaway.Security.ApplicationLayer.UserService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import reactor.core.publisher.*;

@RestController
@RequestMapping("/cart")
public class CartController {

   @Autowired
   private CartService cartService;

   @Autowired
   private ProductService productService;

   @Autowired
   private UserService userService;
    
    @PostMapping("/add")
    public Mono<String> addInCart(@RequestHeader("Authorization") String accessToken, @RequestBody AddProductInCart addProduct){
        return cartService.addInCart(addProduct, accessToken);
    }

    @GetMapping("/get")
    public Mono<?> getInCart(@RequestHeader("Authorization") String accessToken) {
        return cartService.getItemsInCart(accessToken);
    }


    @DeleteMapping("/delete/items/{productId}")
    public Mono<?> removeItemFromCart(@RequestHeader("Authorization") String accessToken, @PathVariable Long productId) {
        return cartService.deleteByProductId(accessToken, productId);
    }

    @PutMapping("/items/{productId}?quantity=:quantity")
    public Mono<?> updateItemQuantity(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long productId,
            @RequestParam int quantity) {

        return cartService.updateItemQuantity(accessToken, productId, quantity);
        
    }

    @GetMapping("/items")
    public Mono<List<CartItem>> getItemsInCart(@RequestHeader("Authorization") String accessToken) {
        return cartService.getItemsInCart(accessToken);
     }

    @DeleteMapping("/delete/{userId}")
    public Mono<String> deleteCart(@RequestHeader("Authorization") String accessToken) {
        return cartService.deleteCart(accessToken);
  
    }


    // @PostMapping("/buy")
    // public Mono<?> buy(@RequestHeader("Authorization") String accessToken) {
    //     Long userId = userService.GetUserId(accessToken);
    //     List<ProductAndQuantity> productsId = cartService.getUserCartProductsId(userId);
    //     return Mono.just(productService.checkProductAvailability(productsId, userId));
    // }



    // @GetMapping("/get/orders")
    // public Flux<?> getOrders(@RequestHeader("Authorization") String accessToken){
    //     Long userId = userService.GetUserId(accessToken);
    //     return Flux.fromIterable(cartService.getOrdersOfUser(userId));
    // }

}
