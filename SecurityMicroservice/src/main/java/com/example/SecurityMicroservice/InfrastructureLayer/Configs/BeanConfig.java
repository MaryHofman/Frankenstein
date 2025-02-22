package com.example.SecurityMicroservice.InfrastructureLayer.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.SecurityMicroservice.ApplicationLayer.UseCases.AuthenticationService;
import com.example.SecurityMicroservice.ApplicationLayer.UseCases.RegistrationService;
import com.example.SecurityMicroservice.ApplicationLayer.UseCases.UserService;

@Configuration 
public class BeanConfig {

    @Bean
    public RegistrationService registrationService() {  
        return new RegistrationService();
    }

    @Bean
    public AuthenticationService authenticationService(){
        return new AuthenticationService();
    }

    @Bean
    public UserService userInformationService(){
        return new UserService();
    }

    
}
