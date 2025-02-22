package com.example.SecurityMicroservice.DomanianLayer.Repositories;

import java.util.Optional;

import com.example.SecurityMicroservice.DomanianLayer.Entityes.User;

public interface UserRepository {
    Optional<User> findById(Long id);
    User save(User user);
    boolean existsByUsername(String username);
    User findByEmail(String email);
}