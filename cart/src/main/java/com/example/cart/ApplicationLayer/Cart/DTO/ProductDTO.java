package com.example.cart.ApplicationLayer.Cart.DTO;

import java.util.List;

import com.example.cart.ApplicationLayer.DTO.ProductCardDTO;

public class ProductDTO {
    
    private Long orderId;
    private List<ProductCardDTO> productsCards;
    private String sum;

    

    public ProductDTO() {
    }

    

    public ProductDTO(Long orderId, List<ProductCardDTO> productsCards, String sum) {
        this.orderId = orderId;
        this.productsCards = productsCards;
        this.sum = sum;
    }



    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public List<ProductCardDTO> getProductsCards() {
        return productsCards;
    }
    public void setProductsCards(List<ProductCardDTO> productsCards) {
        this.productsCards = productsCards;
    }
    public String getSum() {
        return sum;
    }
    public void setSum(String sum) {
        this.sum = sum;
    }

    
}
