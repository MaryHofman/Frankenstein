package com.example.getaway.Security.Adapters;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.getaway.Products.Application.DTO.out.SendAccessDTO;
import com.example.getaway.Security.ApplicationLayer.UserService;
import com.example.getaway.Security.ApplicationLayer.DTO.in.AuthenticationUserRequest;
import com.example.getaway.Security.ApplicationLayer.DTO.in.RegistrationUserRequest;
import com.example.getaway.Security.ApplicationLayer.DTO.out.AuthenticationUserResponce;
import com.example.getaway.Security.ApplicationLayer.DTO.out.RegistrationUserResponse;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@RestController
public class UserController {
    @Autowired
    private UserService userService;
  

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegistrationUserRequest request, HttpServletResponse response) throws InterruptedException {
       
        RegistrationUserResponse userResponse = userService.Registration(request);
        Cookie refreshTokenCookie = new Cookie("refreshToken", userResponse.getRefreshToken());
        refreshTokenCookie.setHttpOnly(true);
        refreshTokenCookie.setPath("/");
        response.addCookie(refreshTokenCookie);

        SendAccessDTO accessToken = new SendAccessDTO(userResponse.getAccessToken());

        return ResponseEntity.ok(accessToken);
    }

    @PostMapping("/authorization")
    public ResponseEntity<?> authorizationUser(@RequestBody AuthenticationUserRequest request, HttpServletResponse response) throws InterruptedException {
        
        AuthenticationUserResponce userResponse = userService.Autentication(request);
        Cookie refreshTokenCookie = new Cookie("refreshToken", userResponse.getRefreshToken());
        refreshTokenCookie.setHttpOnly(true);
        refreshTokenCookie.setPath("/");
        response.addCookie(refreshTokenCookie);

        SendAccessDTO accessToken = new SendAccessDTO(userResponse.getAccessToken());

        return ResponseEntity.ok(accessToken);
    }


    @GetMapping("/getInformationAboutUser")
    public ResponseEntity<?> getUserId(@RequestHeader("Autorization") String accessToken) throws InterruptedException{
        return ResponseEntity.ok(userService.getInformationAboutUser(accessToken));
    }

    @GetMapping("/get/accessToken")
    public ResponseEntity<?> getAccessToken(HttpServletRequest request) throws InterruptedException{
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("refreshToken".equals(cookie.getName())) {
                    String refreshToken = cookie.getValue();
                    return ResponseEntity.ok(userService.getAccessToken(refreshToken));
                }
            }
        }
        return ResponseEntity.badRequest().body("Нет refreshToken");

    }


}

