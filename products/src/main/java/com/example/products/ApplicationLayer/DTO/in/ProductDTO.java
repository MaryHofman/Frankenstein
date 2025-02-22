package com.example.products.ApplicationLayer.DTO.in;

import java.util.List;
import java.util.Map;

import java.util.List;
import java.util.Map;

import java.util.List;
import java.util.Map;

public class ProductDTO {

    private Long id;
    private List<String> listImages;
    private String name;
    private String mainImage;
    private List<String> colors;
    private Map<String, String> characteristics;
    private double price;
    private int discount;
    private String type; 
    private int quantity; 
    private String description; 
    private String nameCtegory;

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }



    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String mainImage, List<String> colors,
                      Map<String, String> characteristics, double price, String type, List<String> listImages,
                      int quantity, int discount, String description) {
        this.id = id;
        this.name = name;
        this.colors = colors;
        this.mainImage = mainImage;
        this.characteristics = characteristics;
        this.price = price;
        this.type = type; 
        this.listImages = listImages;
        this.quantity = quantity; 
        this.discount = discount;
        this.description = description; 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getListImages() {
        return listImages;
    }

    public void setListImages(List<String> listImages) {
        this.listImages = listImages;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
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
