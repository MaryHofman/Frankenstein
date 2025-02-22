package com.example.getaway.Products.Application.DTO.in;

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


    
    public ProductDTO() {
    }

    // Приватный конструктор для использования через билдер
    private ProductDTO(Builder builder) {
        this.id = builder.id;
        this.listImages = builder.listImages;
        this.name = builder.name;
        this.mainImage = builder.mainImage;
        this.colors = builder.colors;
        this.characteristics = builder.characteristics;
        this.price = builder.price;
        this.discount = builder.discount;
        this.type = builder.type;
        this.quantity = builder.quantity;
        this.description = builder.description;
        this.nameCtegory = builder.nameCtegory;
    }

    // Геттеры (оставляем как есть)

    public Long getId() {
        return id;
    }

    public List<String> getListImages() {
        return listImages;
    }

    public String getName() {
        return name;
    }

    public String getMainImage() {
        return mainImage;
    }

    public List<String> getColors() {
        return colors;
    }

    public Map<String, String> getCharacteristics() {
        return characteristics;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public String getNameCtegory() {
        return nameCtegory;
    }

    // Статический вложенный класс Builder
    public static class Builder {
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

        // Методы для установки каждого поля
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder listImages(List<String> listImages) {
            this.listImages = listImages;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder mainImage(String mainImage) {
            this.mainImage = mainImage;
            return this;
        }

        public Builder colors(List<String> colors) {
            this.colors = colors;
            return this;
        }

        public Builder characteristics(Map<String, String> characteristics) {
            this.characteristics = characteristics;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder discount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder nameCtegory(String nameCtegory) {
            this.nameCtegory = nameCtegory;
            return this;
        }

        public ProductDTO build() {
            return new ProductDTO(this);
        }
    }
}

