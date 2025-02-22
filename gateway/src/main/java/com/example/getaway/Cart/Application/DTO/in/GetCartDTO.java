package com.example.getaway.Cart.Application.DTO.in;


class ProductInCartDTO {
    
    private long id;
    private String listImage;
    private String name;
    private String price;
    private String type;
    private int quantity;

    public void initialize(long id, String listImage, String name, String price, String type, int quantity) {
        this.id = id;
        this.listImage = listImage;
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }
   
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getListImage() {
        return listImage;
    }

    public void setListImage(String listImage) {
        this.listImage = listImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

public class GetCartDTO {
    private ProductInCartDTO product;
    private int quantity;
    private String price;


    public void initializeCart(long id, String listImage, String name, String price, String type, int quantity) {
        this.product = new ProductInCartDTO();
        this.product.initialize(id, listImage, name, price, type, quantity);
    }
    public ProductInCartDTO getProduct() {
        return product;
    }

    public void setProduct(ProductInCartDTO product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
