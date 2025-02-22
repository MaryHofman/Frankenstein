package com.example.cart.InfrastructureLayer.Repositoryes.Cart;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.cart.DomanianLayer.Entyties.Cart.Cart;
import com.example.cart.DomanianLayer.Entyties.Cart.CartItem;
import com.example.cart.InfrastructureLayer.Repositoryes.Cart.EntityRepositories.CartItemJpa;
import com.example.cart.InfrastructureLayer.Repositoryes.Cart.EntityRepositories.CartJpa;
import com.example.cart.InfrastructureLayer.Repositoryes.Cart.Mappers.CartItemConverter;
import com.example.cart.InfrastructureLayer.Repositoryes.Cart.Mappers.CartMapper;

import jakarta.transaction.Transactional;

@Repository
public class CartRepository {

    @Autowired
    private CartJpaRepository cartJpaRepository;

    @Autowired
    private CartItemJpaRepository CartItemJpaRepository;


    public Cart findByUserId(Long userId) {
        System.out.println("UserId  "+userId);
        CartJpa cartUser = cartJpaRepository.findByUserId(userId);
        return CartMapper.toDto(cartUser);
    }

    public void saveCartItem(CartItem addProductInCart) {
        CartItemJpa newCartItem = CartItemConverter.toEntity(addProductInCart);
        CartItemJpa savedCartItem = CartItemJpaRepository.save(newCartItem);

        if (savedCartItem.getId() != null) {
            System.out.println("CartItem was successfully saved with ID: " + savedCartItem.getId());
        } else {
            System.out.println("Failed to save the cartItem.");
        }
    }

    public Cart saveNewCart(Cart userCart) {
   
        CartJpa newCart = CartMapper.toEntity(userCart);
        CartJpa savedCart = cartJpaRepository.save(newCart);

        if (savedCart.getId() != null) {
            System.out.println("Cart was successfully saved with ID: " + savedCart.getId());
        } else {
            System.out.println("Failed to save the cart.");
        }
        return CartMapper.toDto(savedCart);
    }

    @Transactional 
    public void deleteCartItem(Long cartId, Long productId) {
        CartItemJpaRepository.deleteByCartIdAndProductId(cartId, productId);
    }

    public List<CartItem> getItemsInCart(Long id) {
        List<CartItemJpa> listCartItems = CartItemJpaRepository.findAllByCartId(id);
        List<CartItem> cartItems = listCartItems.stream()
                    .map(CartItemConverter::toDto) 
                    .collect(Collectors.toList());
        return cartItems;
    }

    public CartItem updateItemQuantity(Long cartId, Long productId, int quantity) {
        CartItemJpa cartItem = CartItemJpaRepository.findByCartIdAndProductId(cartId, productId);
        cartItem.setQuantity(cartItem.getQuantity()+quantity);
        CartItemJpa addQuantity = CartItemJpaRepository.save(cartItem);
        return CartItemConverter.toDto(addQuantity);
    }

    public void deleteCart(Long id) {

        cartJpaRepository.deleteById(id);
        if (cartJpaRepository.existsById(id)) {
            throw new RuntimeException("Failed to delete cart with ID " + id);
        }
    }
    
    
}
