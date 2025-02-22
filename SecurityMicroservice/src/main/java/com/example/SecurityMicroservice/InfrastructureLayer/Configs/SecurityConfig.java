package com.example.SecurityMicroservice.InfrastructureLayer.Configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.example.SecurityMicroservice.ApplicationLayer.CustomUserDetailsService;
import com.example.SecurityMicroservice.ApplicationLayer.UseCases.JWTService;
import com.example.SecurityMicroservice.InfrastructureLayer.CustomAuthenticationProvider;
import com.example.SecurityMicroservice.InfrastructureLayer.Filters.JWTAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;
    @Autowired
    private JWTService jwtService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(HttpMethod.GET, "/api/security/user/information").authenticated() 
                .anyRequest().permitAll()  
            )
            .csrf().disable()
            .formLogin(form -> form.disable()) 
            .httpBasic().disable()  
            .addFilterBefore(jwtAuthenticationFilter(), BasicAuthenticationFilter.class) 
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);  

        return http.build();
    }

    @Bean
    public JWTAuthenticationFilter jwtAuthenticationFilter() {
        return new JWTAuthenticationFilter(jwtService, customUserDetailsService);
    }
}
