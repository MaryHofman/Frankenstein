package com.example.SecurityMicroservice.InfrastructureLayer;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;

public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final PasswordEncoder passwordEncoder;

    public CustomAuthenticationProvider(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        System.out.println("Hello2");
        System.out.println(authentication.getName());
        System.out.println(authentication.getCredentials().toString());

        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        if ("admin".equals(username)) {
            String encodedPassword = passwordEncoder.encode("admin");

            if (passwordEncoder.matches(password, encodedPassword)) {
                UserDetails user = User.withUsername(username)
                        .password(encodedPassword)
                        .roles("USER")
                        .build();

                return new UsernamePasswordAuthenticationToken(user, password, user.getAuthorities());
            } else {
                System.out.println("Invalid password");
                throw new BadCredentialsException("Invalid password");
            }
        } else {
            System.out.println("User not found");
            throw new BadCredentialsException("User not found");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
