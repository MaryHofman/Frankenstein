package com.example.getaway.ApplicationLayer.DTO;

public class OrderItemsGRPCDTO {
    private Long productId;
    private String name;
    private String type;
    private String price;
    private String photo;

    // Конструкторы, геттеры и сеттеры

    public OrderItemsGRPCDTO() {
    }

    public OrderItemsGRPCDTO(Long productId, String name, String type, String price, String photo) {
        this.productId = productId;
        this.name = name;
        this.type = type;
        this.price = price;
        this.photo = photo;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
