package com.example.cart.ApplicationLayer.DTO;

public class ProductCardDTO {

    private Long productId;
    private String name;
    private String mainPhoto;
    private String price;
    private String type;
    private String discount;

    

    public ProductCardDTO() {
    }

    

    public ProductCardDTO(Long productId, String name, String mainPhoto, String price, String type, String discount) {
        this.productId = productId;
        this.name = name;
        this.mainPhoto = mainPhoto;
        this.price = price;
        this.type = type;
        this.discount = discount;
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
    public String getMainPhoto() {
        return mainPhoto;
    }
    public void setMainPhoto(String mainPhoto) {
        this.mainPhoto = mainPhoto;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



    public String getDiacount() {
        return discount;
    }



    public void setDiacount(String discount) {
        this.discount = discount;
    }

    
}
