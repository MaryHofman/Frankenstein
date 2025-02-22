package com.example.getaway.Products.Application.DTO.in;

import java.util.List;
import java.util.Map;

public class UpdateProductRequest {
    private Long id;
    private String name;
    private List<String> colors;
    private Map<String, String> characteristics;
    private double price;
    private int discount;
    private String type; 
    private int quantity; 
    private String description; 
    private String nameCtegory;

    public UpdateProductRequest() {
    }

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getNameCtegory() {
        return nameCtegory;
    }
    public void setNameCtegory(String nameCtegory) {
        this.nameCtegory = nameCtegory;
    }

    
    
}
