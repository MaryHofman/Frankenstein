package com.example.SecurityMicroservice.ApplicationLayer.UseCases;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.SecurityMicroservice.ApplicationLayer.DTO.in.RegistrationRequest;
import com.example.SecurityMicroservice.ApplicationLayer.DTO.out.RegistrationResponce;
import com.example.SecurityMicroservice.DomanianLayer.Entityes.Role;
import com.example.SecurityMicroservice.DomanianLayer.Entityes.User;
import com.example.SecurityMicroservice.DomanianLayer.Repositories.UserRepository;
import com.example.SecurityMicroservice.DomanianLayer.UseCases.RegistrationUseCase;


public class RegistrationService implements RegistrationUseCase<RegistrationRequest, RegistrationResponce>{

    @Autowired
    private JWTService jwtService;

    @Autowired
    private  UserRepository userRepository;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public RegistrationResponce Registration(RegistrationRequest newUserData) {
        
        try{
        String hashedPassword = hashPassword(newUserData.getPassword());
        User user = new User.Builder()
            .id(1L)
            .username(newUserData.getUsername())
            .email(newUserData.getEmail())
            .phone(newUserData.getPhoneNumber())
            .password(hashedPassword)
            .roles(Arrays.asList(new Role(1L,"USER")))
            .build();
        
        User savedUser = userRepository.save(user);

        if (savedUser.getId() != null) {
            String accessToken = jwtService.generateAccessToken(savedUser);
            String refreshToken = jwtService.generateRefreshToken(savedUser);

            return new RegistrationResponce(accessToken, refreshToken);
        } else {
            throw new RuntimeException("User not saved properly");
        }}
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("Failed to save user", e);
        }
    }

    @Override
    public boolean veryfyPassword(String password) {
    
        throw new UnsupportedOperationException("Unimplemented method 'veryfyPassword'");
    }

    @Override
    public boolean isUsernameUnique(String username) {
    
        throw new UnsupportedOperationException("Unimplemented method 'isUsernameUnique'");
    }

    @Override
    public boolean isEmailUnique(String email) {

        throw new UnsupportedOperationException("Unimplemented method 'isEmailUnique'");
    }

    @Override
    public String hashPassword(String password) {
        return passwordEncoder.encode(password);
    }

    @Override
    public String generateAccessToken(User user) {
        return jwtService.generateAccessToken(user);
    }

    @Override
    public String generateRefreshToken(User user) {
       return jwtService.generateRefreshToken(user);
    }

    
    
}
