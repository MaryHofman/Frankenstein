package com.example.getaway.Security.ApplicationLayer.DTO.out;

public class AuthenticationUserResponce {
    private String accessToken;
    private String refreshToken;

    public AuthenticationUserResponce() {
    }

    public AuthenticationUserResponce(String accessToken, String refreshToken) {
       
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

   
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public AuthenticationUserResponce clone() {
        try {
            return (AuthenticationUserResponce) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported", e);
        }
    }

}
