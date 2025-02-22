package com.example.getaway.Security.ApplicationLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.getaway.Security.ApplicationLayer.DTO.in.AuthenticationUserRequest;
import com.example.getaway.Security.ApplicationLayer.DTO.in.RegistrationUserRequest;
import com.example.getaway.Security.ApplicationLayer.DTO.out.AuthenticationUserResponce;
import com.example.getaway.Security.ApplicationLayer.DTO.out.InformationAbouUserDTO;
import com.example.getaway.Security.ApplicationLayer.DTO.out.RegistrationUserResponse;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    private WebClient webClientSecurity;

    public AuthenticationUserResponce Autentication(AuthenticationUserRequest request){
        
        Mono<AuthenticationUserResponce> result = webClientSecurity.post()
            .uri("/api/security/auth")
            .bodyValue(request)
            .retrieve()
            .bodyToMono(AuthenticationUserResponce.class);

        AuthenticationUserResponce response = result.block();

        return response;

    }

    public RegistrationUserResponse Registration(RegistrationUserRequest request){

        Mono<RegistrationUserResponse> result = webClientSecurity.post()
            .uri("/api/security/register")
            .bodyValue(request)
            .retrieve()
            .bodyToMono(RegistrationUserResponse.class);

        RegistrationUserResponse response = result.block();

        return  response;
    }
    
    public Long GetUserId(String accessTocken){
        
        return null;

    }

    public InformationAbouUserDTO getInformationAboutUser(String accessToken){

        Mono<InformationAbouUserDTO> result = webClientSecurity.get()
            .uri("/api/security/user/information")
            .header("Authorization",accessToken)
            .retrieve()
            .bodyToMono(InformationAbouUserDTO.class);

        InformationAbouUserDTO response = result.block();
        
        return response;
    }


    public String getAccessToken(String refreshToken) {
        Mono<String> result = webClientSecurity.get()
                .uri("/api/security/get/accessToken")
                .cookie("RefreshToken",refreshToken)
                .retrieve()
                .bodyToMono(String.class);

        String response = result.block();
    
        return response;}


}
