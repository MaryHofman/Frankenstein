package com.example.products.InfrastructureLayer.Entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import lombok.Data;

import javax.persistence.*;

import com.example.products.ApplicationLayer.DTO.in.ProductDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "Products")
@Data
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "product_images", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "image")
    private List<String> listImages;

    @Column(name = "mainImage")
    private String mainImage;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ElementCollection
    @CollectionTable(name = "product_colors", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "color")
    private List<String> colors;

    @ElementCollection
    @CollectionTable(name = "product_characteristics", joinColumns = @JoinColumn(name = "product_id"))
    @MapKeyColumn(name = "characteristic_key")
    @Column(name = "characteristic_value")
    private Map<String, String> characteristics;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")  
    private Integer quantity;

    @Column(name = "type")
    private String type;

    @Column(name = "discount") 
    private String discount;

    public ProductDTO convertToProductDTO(Products product){
        
        return new ProductDTO(
            product.getId(),
            product.getName(),
            product.getMainImage(),
            product.getColors(),
            product.getCharacteristics(),
            product.getPrice().doubleValue(),
            product.getType(),
            product.getListImages()!= null ? product.getListImages() : null,
            product.getQuantity() != null ? product.getQuantity() : 0,
            product.getDiscount() != "" ? Integer.parseInt(product.getDiscount()) : 0,
            product.getDescription()
        );
    }
}
