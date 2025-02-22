package com.example.SecurityMicroservice.InfrastructureLayer.Filters;

import java.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;

import com.example.SecurityMicroservice.ApplicationLayer.CustomUserDetailsService;
import com.example.SecurityMicroservice.ApplicationLayer.UseCases.JWTService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;

@Component
public class JWTAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    private  JWTService jwtService;

    @Autowired
    private CustomUserDetailsService userDetailsService;


   

    public JWTAuthenticationFilter(JWTService jwtService2, CustomUserDetailsService customUserDetailsService) {
                this.jwtService = jwtService2;
                this.userDetailsService = customUserDetailsService;
    }




    @Override
    protected void doFilterInternal(HttpServletRequest request, 
                                    HttpServletResponse response, 
                                    FilterChain filterChain) 
                                    throws ServletException, IOException {

        String authorizationHeader = request.getHeader("Authorization");

        if (StringUtils.hasText(authorizationHeader)) {
            String token = authorizationHeader;

            if (jwtService.validateToken(token, jwtService.getSecurityAccess())) {
                String username = jwtService.extractAllClaims(token, jwtService.getSecurityAccess()).get("email", String.class);
                System.out.println("Email "+username);
                UserDetails userDetails = userDetailsService.loadUserByUsername(username);

                UsernamePasswordAuthenticationToken authenticationToken =
                        new UsernamePasswordAuthenticationToken(
                                userDetails, null, userDetails.getAuthorities());

                SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            }
        }

       
        filterChain.doFilter(request, response);
    }
}
