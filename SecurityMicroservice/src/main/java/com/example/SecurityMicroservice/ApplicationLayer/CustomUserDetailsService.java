package com.example.SecurityMicroservice.ApplicationLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.SecurityMicroservice.DomanianLayer.Entityes.User;
import com.example.SecurityMicroservice.InfrastructureLayer.Repositories.InfrastructureUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private  InfrastructureUserRepository userRepository; 

    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User userEntity = userRepository.findByEmail(email);

        return org.springframework.security.core.userdetails.User.builder()
                .username(userEntity.getEmail())
                .password(userEntity.getPassword())
                .authorities("ROLE_USER")
                .build();
    }
}
