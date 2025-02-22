package com.example.getaway.Products.Application.DTO.out;

public class SendAccessDTO {
    private String accessToken;


    public SendAccessDTO() {
    }

    public SendAccessDTO(String accessToken) { 
        this.accessToken = accessToken;
    }

   
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
