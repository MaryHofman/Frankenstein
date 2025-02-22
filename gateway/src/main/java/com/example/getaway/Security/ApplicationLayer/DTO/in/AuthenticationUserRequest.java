package com.example.getaway.Security.ApplicationLayer.DTO.in;

public class AuthenticationUserRequest {

    private String email;
    private String password;

    
    
    public AuthenticationUserRequest() {
    }

    public AuthenticationUserRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCorrelationId(String correlationId) {
    }

    

    
    
}
