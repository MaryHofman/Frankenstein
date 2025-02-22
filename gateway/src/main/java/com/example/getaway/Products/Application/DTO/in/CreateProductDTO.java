package com.example.getaway.Products.Application.DTO.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateProductDTO {
    
    @JsonProperty("name")
    private String name;

    @JsonProperty("colors")
    private List<String> colors = new ArrayList<>();

    @JsonProperty("characteristics")
    private Map<String, String> characteristics = new HashMap<>();

    @JsonProperty("price")
    private String price;

    @JsonProperty("discount")
    private String discount;

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("type")
    private String type;

    @JsonProperty("description")
    private String description;

    public CreateProductDTO(String name, List<String> colors,
                            Map<String, String> characteristics, String price, String discount, 
                            Integer quantity, String type, String description) { 
        
        this.name = name;
        this.colors = colors;
        this.characteristics = characteristics;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.type = type;
        this.description = description; 
    }

    public CreateProductDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public Map<String, String> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Map<String, String> characteristics) {
        this.characteristics = characteristics;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) { 
        this.discount = discount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() { 
        return description;
    }

    public void setDescription(String description) { 
        this.description = description;
    }

    @Override
    public String toString() {
        return "CreateProductDTO{" +
                "name='" + name + '\'' +
                ", colors=" + colors +
                ", characteristics=" + characteristics +
                ", price=" + price +
                ", discount=" + discount + 
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' + 
                '}';
    }
}