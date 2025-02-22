package com.example.getaway.Security.ApplicationLayer.DTO.in;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class RegistrationUserRequest {

    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private String confirmPassword;


    // Конструктор по умолчанию
    public RegistrationUserRequest() {
    }

    // Конструктор с параметрами (опционально)
    public RegistrationUserRequest(String username, String email, String password, String phoneNumber,
            String confirmPassword) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.confirmPassword = confirmPassword;
        
    }

    // Геттеры и сеттеры
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
