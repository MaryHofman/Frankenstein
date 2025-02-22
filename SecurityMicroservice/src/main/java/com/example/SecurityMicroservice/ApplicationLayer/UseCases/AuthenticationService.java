package com.example.SecurityMicroservice.ApplicationLayer.UseCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.SecurityMicroservice.ApplicationLayer.DTO.in.LoginRequest;
import com.example.SecurityMicroservice.ApplicationLayer.DTO.out.RegistrationResponce;
import com.example.SecurityMicroservice.DomanianLayer.Entityes.User;
import com.example.SecurityMicroservice.DomanianLayer.Repositories.UserRepository;
import com.example.SecurityMicroservice.DomanianLayer.UseCases.LoginUseCase;

public class AuthenticationService implements LoginUseCase<LoginRequest, RegistrationResponce>{

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private JWTService jwtService;
    
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public RegistrationResponce authorization(LoginRequest userInformation) {
        try{

            User existUser = userRepository.findByEmail(userInformation.getEmail());
            if(passwordEncoder.matches(userInformation.getPassword(), existUser.getPassword())){

                String accessToken = jwtService.generateAccessToken(existUser);
                String refreshToken = jwtService.generateRefreshToken(existUser);

                return new RegistrationResponce(accessToken, refreshToken);

            }
            else{
                throw new RuntimeException("Not correct password");
            }
        }
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("Failed to find user", e);
        }
    }

    @Override
    public boolean verifyCredentials(String username, String password) {

        throw new UnsupportedOperationException("Unimplemented method 'verifyCredentials'");
    }

    @Override
    public String generateAccessToken(User user) {
 
        throw new UnsupportedOperationException("Unimplemented method 'generateAccessToken'");
    }

    @Override
    public String generateRefreshToken(User user) {
   
        throw new UnsupportedOperationException("Unimplemented method 'generateRefreshToken'");
    }

    @Override
    public String refreshAccessToken(String refreshToken) {
        throw new UnsupportedOperationException("Unimplemented method 'refreshAccessToken'");
    }

    @Override
    public void blockAccount(String username) {
        throw new UnsupportedOperationException("Unimplemented method 'blockAccount'");
    }
    
}
