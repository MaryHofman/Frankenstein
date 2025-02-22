package com.example.SecurityMicroservice.AdapterLayer.Controllers;

import java.util.Base64;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SecurityMicroservice.ApplicationLayer.DTO.in.LoginRequest;
import com.example.SecurityMicroservice.ApplicationLayer.DTO.in.RegistrationRequest;
import com.example.SecurityMicroservice.ApplicationLayer.DTO.out.RegistrationResponce;
import com.example.SecurityMicroservice.ApplicationLayer.UseCases.AuthenticationService;
import com.example.SecurityMicroservice.ApplicationLayer.UseCases.RegistrationService;
import com.example.SecurityMicroservice.ApplicationLayer.UseCases.UserService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/security")
public class SecurityController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private UserService userService;

    @PostMapping("/auth")
    public ResponseEntity<?> auth(@RequestBody LoginRequest credentials) {
        try {
            return ResponseEntity.ok(authenticationService.authorization(credentials));
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }

    }


    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegistrationRequest registrationDTO) {
        RegistrationResponce jwt = registrationService.Registration(registrationDTO);
        return ResponseEntity.ok(jwt); 
    }

    @GetMapping("/user/information")
    public ResponseEntity<?> userInformation(@RequestHeader("Authorization") String accessToken){
        return ResponseEntity.ok(userService.getUserInformation(accessToken));
    }

    @GetMapping("/user/id")
    public ResponseEntity<?> userId(@RequestHeader("Authorization") String accessToken){
        return ResponseEntity.ok(userService.getUserId(accessToken));
    }

    @GetMapping("/get/accessToken")
    public ResponseEntity<?> getAccessToken(HttpServletRequest request) throws InterruptedException{
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("RefreshToken".equals(cookie.getName())) {
                    
                    String refreshToken = cookie.getValue();
                    System.out.println("RefreshToken  "+ refreshToken);
                    return ResponseEntity.ok(userService.getAccessToken(refreshToken));
                }
            }
        }
        return ResponseEntity.badRequest().body("Нет refreshToken");

    }
}

