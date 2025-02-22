package com.example.SecurityMicroservice.ApplicationLayer.UseCases;

import org.apache.tomcat.util.buf.StringCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.SecurityMicroservice.ApplicationLayer.DTO.out.UserInformation;
import com.example.SecurityMicroservice.DomanianLayer.Entityes.User;
import com.example.SecurityMicroservice.DomanianLayer.Repositories.UserRepository;

    @Service
    public class UserService {

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private JWTService jwtService;
    
    public UserInformation getUserInformation(String token) {

      String email = jwtService.getEmail(token, jwtService.getSecurityAccess());
  
      if (email == null || email.isEmpty()) {
          System.out.println("Invalid email from token");
          throw new IllegalArgumentException("Invalid token or email not found");
      }
  
      User user = userRepository.findByEmail(email);
      if (user == null) {
          System.out.println("No user found with email: " + email);
          throw new IllegalArgumentException("User not found");
      }
  
      return new UserInformation(user.getId(), user.getUsername(), user.getEmail(), user.getPhone());
  }

       public Long getUserId(String token){
             String email = jwtService.getEmail(token, jwtService.getSecurityAccess());
             User user = userRepository.findByEmail(email);
             return user.getId();
       }

    public String getAccessToken(String refreshToken) {
        String accessToken = jwtService.refreshAccessToken(refreshToken);
        return accessToken;
    }
    }
    
    

