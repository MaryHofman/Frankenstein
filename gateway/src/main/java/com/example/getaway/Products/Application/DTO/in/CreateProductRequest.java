package com.example.getaway.Products.Application.DTO.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.getaway.Products.Infrastructure.Base64Deserializer;
import com.example.getaway.Products.Infrastructure.Base64Serializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateProductRequest {
    @JsonProperty("name")
    private String name;

    @JsonProperty("photos")
    private List<String> photos;

    @JsonProperty("mainPhoto")
    private String mainPhoto;

    @JsonProperty("colors")
    private List<String> colors;

    @JsonProperty("characteristics")
    private Map<String, String> characteristics;

    @JsonProperty("price")
    private String price;

    @JsonProperty("discount")
    private String discount;

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("type")
    private String type;

    @JsonProperty("description") // New description field
    private String description; // New field for description

    public CreateProductRequest() {
    }

    private CreateProductRequest(Builder builder) {
        this.name = builder.name;
        this.photos = builder.photos;
        this.mainPhoto = builder.mainPhoto;
        this.colors = builder.colors;
        this.characteristics = builder.characteristics;
        this.price = builder.price;
        this.discount = builder.discount;
        this.quantity = builder.quantity;
        this.type = builder.type;
        this.description = builder.description; // Initialize description
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private List<String> photos = new ArrayList<>();
        private String mainPhoto;
        private List<String> colors = new ArrayList<>();
        private Map<String, String> characteristics = new HashMap<>();
        private String price;
        private String discount;
        private Integer quantity;
        private String type;
        private String description; // New field for description in Builder

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder photos(List<String> photos) {
            this.photos = photos;
            return this;
        }

        public Builder addPhoto(String photo) {
            this.photos.add(photo);
            return this;
        }

        public Builder mainPhoto(String mainPhoto) {
            this.mainPhoto = mainPhoto;
            return this;
        }

        public Builder colors(List<String> colors) {
            this.colors = colors;
            return this;
        }

        public Builder addColor(String color) {
            this.colors.add(color);
            return this;
        }

        public Builder characteristics(Map<String, String> characteristics) {
            this.characteristics = characteristics;
            return this;
        }

        public Builder addCharacteristic(String key, String value) {
            this.characteristics.put(key, value);
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder discount(String discount) {
            this.discount = discount;
            return this;
        }

        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder description(String description) { // New method for setting description
            this.description = description;
            return this;
        }

        public CreateProductRequest build() {
            return new CreateProductRequest(this);
        }
    }


    @Override
    public String toString() {
        return "CreateProductRequest{" +
                "name='" + name + '\'' +
                ", photos=" + photos +
                ", mainPhoto=" + (mainPhoto != null ? "[binary data]" : null) +
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


