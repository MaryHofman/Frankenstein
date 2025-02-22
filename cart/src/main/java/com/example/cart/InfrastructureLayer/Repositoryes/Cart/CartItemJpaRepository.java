package com.example.cart.InfrastructureLayer.Repositoryes.Cart;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cart.InfrastructureLayer.Repositoryes.Cart.EntityRepositories.CartItemJpa;



@Repository
public interface CartItemJpaRepository  extends JpaRepository<CartItemJpa, Long> {
    CartItemJpa findByUserId(Long userId);
    List<CartItemJpa> findAllByCartId(Long cartId);
    List<CartItemJpa> findByUserIdAndProductId(Long userId, Long id);
    boolean existsByProductId(long productId);
    void deleteAllByProductId(long productId);
    void deleteByCartIdAndProductId(Long cartId, Long productId);
    CartItemJpa findByCartIdAndProductId(Long cartId, Long productId);
   
}
