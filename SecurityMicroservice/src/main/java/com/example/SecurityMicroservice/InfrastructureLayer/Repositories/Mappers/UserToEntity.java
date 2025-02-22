package com.example.SecurityMicroservice.InfrastructureLayer.Repositories.Mappers;

import com.example.SecurityMicroservice.DomanianLayer.Entityes.User;
import com.example.SecurityMicroservice.InfrastructureLayer.JpaEntyties.UserEntity;

public class UserToEntity {

    public static UserEntity convert(User user){
        return new UserEntity(user.getUsername(), user.getEmail(), user.getPhone(), user.getPassword());
    }

    public static User convertBack(UserEntity userEntity) {
        return new User.Builder()
                .id(userEntity.getId())  
                .username(userEntity.getUsername())
                .email(userEntity.getEmail())
                .phone(userEntity.getPhoneNumber())
                .password(userEntity.getPassword())
                .build();
    }
    
}
