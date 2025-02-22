package com.example.cart.InfrastructureLayer.Repositoryes.Cart.Mappers;

import com.example.cart.DomanianLayer.Entyties.Cart.Cart;
import com.example.cart.InfrastructureLayer.Repositoryes.Cart.EntityRepositories.CartJpa;

public class CartMapper {

    public static Cart toDto(CartJpa entity) {
        if (entity == null) {
            return null;
        }
        Cart dto = new Cart(
            entity.getId(),
            entity.getUserId(),
            entity.getCreatedDate()
        );
        
        return dto;
    }


    public static CartJpa toEntity(Cart dto) {
        if (dto == null) {
            return null;
        }
        CartJpa entity = new CartJpa();

        if(dto.getId()!=null){
            entity.setId(dto.getId());
        }
        
        entity.setUserId(dto.getUserId());
        entity.setCreatedDate(dto.getCreatedDate());
      
        return entity;
    }
    
}
