package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.kafka.KafkaProducer;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private KafkaProducer kafkaProducer;

    public CompletableFuture<User> getUserById(int userIntId){
        return CompletableFuture.supplyAsync(() -> userRepository.findById(userIntId).orElse(null));
    }

    public User saveUser(User user){
        User user1 =  userRepository.save(user);
        kafkaProducer.sendMessage("my-topic", user1.toString());
        return user;
    }
}
