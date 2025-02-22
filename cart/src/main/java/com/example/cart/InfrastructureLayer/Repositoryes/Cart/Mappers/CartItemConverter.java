package com.example.cart.InfrastructureLayer.Repositoryes.Cart.Mappers;

import com.example.cart.DomanianLayer.Entyties.Cart.CartItem;
import com.example.cart.InfrastructureLayer.Repositoryes.Cart.EntityRepositories.CartItemJpa;

public class CartItemConverter {


    public static CartItem toDto(CartItemJpa entity) {
        if (entity == null) {
            return null;
        }
        CartItem dto = new CartItem(
            entity.getId(),
            entity.getCartId(),
            entity.getUserId(),
            entity.getProductId(),
            entity.getQuantity()
        );
        dto.setCartId(entity.getCartId());
        dto.setPurchased(entity.isPurchased());
        return dto;
    }


    public static CartItemJpa toEntity(CartItem dto) {
        if (dto == null) {
            return null;
        }
        CartItemJpa entity = new CartItemJpa();
        entity.setId(dto.getId());
        entity.setCartId(dto.getCartId());
        entity.setUserId(dto.getUserId());
        entity.setProductId(dto.getProductId());
        entity.setQuantity(dto.getQuantity());
        entity.setPurchased(dto.isPurchased());
        return entity;
    }
}

