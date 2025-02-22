package com.example.SecurityMicroservice.DomanianLayer.UseCases;

import com.example.SecurityMicroservice.DomanianLayer.Entityes.User;

public interface RegistrationUseCase<T, U>{
    public Object Registration(T newUserData);
    public boolean veryfyPassword(String password);
    public boolean isUsernameUnique(String username);
    public boolean isEmailUnique(String email);
    public String hashPassword(String password);
    public String generateAccessToken(User user);
    public  String generateRefreshToken(User user);
}
