package com.example.SecurityMicroservice.DomanianLayer.UseCases;

import com.example.SecurityMicroservice.DomanianLayer.Entityes.User;

public interface LoginUseCase<T, U> {
    
    public U authorization(T userInformation);
    boolean verifyCredentials(String username, String password);
    public String generateAccessToken(User user);
    public String generateRefreshToken(User user);
    public String refreshAccessToken(String refreshToken);
    public void blockAccount(String username);
}
