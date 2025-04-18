package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.concurrent.CompletableFuture;

public interface UserService {

    CompletableFuture<User> getUserById(int userIntId);
    User saveUser(User user);
}
