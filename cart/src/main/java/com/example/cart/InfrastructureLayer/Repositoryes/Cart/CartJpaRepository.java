package com.example.cart.InfrastructureLayer.Repositoryes.Cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.cart.InfrastructureLayer.Repositoryes.Cart.EntityRepositories.CartJpa;

@Repository
public interface CartJpaRepository extends JpaRepository<CartJpa, Long> {
    CartJpa findByUserId(Long userId);
}
