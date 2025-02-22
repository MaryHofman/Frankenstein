package com.example.SecurityMicroservice.DomanianLayer.Entityes;

import java.util.List;

import java.util.List;

public class User {

    private Long id;
    private String username;
    private String email;
    private String phone;
    private String password;
    private List<Role> roles;

    private User(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.email = builder.email;
        this.phone = builder.phone;
        this.password = builder.password;
        this.roles = builder.roles;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(String roleName) {
        return roles.stream().anyMatch(role -> role.getName().equals(roleName));
    }

    public static class Builder {
        private Long id;
        private String username;
        private String email;
        private String phone;
        private String password;
        private List<Role> roles;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder roles(List<Role> roles) {
            this.roles = roles;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

