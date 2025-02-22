package com.example.SecurityMicroservice.InfrastructureLayer.JpaRepositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SecurityMicroservice.DomanianLayer.Entityes.User;
import com.example.SecurityMicroservice.InfrastructureLayer.JpaEntyties.UserEntity;

public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findById(Long id);

    UserEntity findByEmail(String email);}
