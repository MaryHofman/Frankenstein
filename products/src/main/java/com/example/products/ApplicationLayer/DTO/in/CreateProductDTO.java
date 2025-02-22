package com.example.products.ApplicationLayer.DTO.in;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateProductDTO {
    private List<String> photos = new ArrayList<>();
    private String mainPhoto;
    private String name;
    private List<String> colors = new ArrayList<>();
    private Map<String, String> characteristics = new HashMap<>();
    private String price;
    private String discount; 
    private Integer quantity;
    private String type;
    private String description; // New description field

    public CreateProductDTO(List<String> photos, String mainPhoto, String name, List<String> colors,
                            Map<String, String> characteristics, String price, String discount, 
                            Integer quantity, String type, String description) { // Updated constructor
        this.photos = photos;
        this.mainPhoto = mainPhoto;
        this.name = name;
        this.colors = colors;
        this.characteristics = characteristics;
        this.price = price;
        this.discount = discount;  
        this.quantity = quantity;
        this.type = type;
        this.description = description; // Initialize description
    }

    public CreateProductDTO() {
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public String getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(String mainPhoto) {
        this.mainPhoto = mainPhoto;
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

    public String getDescription() { // New getter for description
        return description;
    }

    public void setDescription(String description) { // New setter for description
        this.description = description;
    }

    @Override
    public String toString() {
        return "CreateProductDTO{" +
                "photos=" + photos +
                ", mainPhoto='" + mainPhoto + '\'' +
                ", name='" + name + '\'' +
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
