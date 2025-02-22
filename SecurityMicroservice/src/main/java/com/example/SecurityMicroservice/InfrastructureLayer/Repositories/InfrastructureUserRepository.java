package com.example.SecurityMicroservice.InfrastructureLayer.Repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SecurityMicroservice.DomanianLayer.Entityes.User;
import com.example.SecurityMicroservice.DomanianLayer.Repositories.UserRepository;
import com.example.SecurityMicroservice.InfrastructureLayer.JpaEntyties.UserEntity;
import com.example.SecurityMicroservice.InfrastructureLayer.JpaRepositories.JpaUserRepository;
import com.example.SecurityMicroservice.InfrastructureLayer.Repositories.Mappers.UserToEntity;

@Repository
public class InfrastructureUserRepository implements UserRepository {

    @Autowired
    private JpaUserRepository jpaUserRepository;

    @Override
    public Optional<User> findById(Long id) {
        UserEntity user = jpaUserRepository.findById(id).get();
        return null;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = UserToEntity.convert(user);
        jpaUserRepository.save(userEntity);
        User convertEntity = UserToEntity.convertBack(userEntity);
        return convertEntity;
        
    }

    @Override
    public boolean existsByUsername(String username) {
      
        throw new UnsupportedOperationException("Unimplemented method 'existsByUsername'");
    }

    @Override
    public User findByEmail(String email) {
        UserEntity user = jpaUserRepository.findByEmail(email);
        User convertUser = UserToEntity.convertBack(user);
        return convertUser;
    }
}
