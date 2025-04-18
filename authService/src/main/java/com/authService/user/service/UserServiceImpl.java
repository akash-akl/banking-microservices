package com.authService.user.service;

import com.authService.secuirity.entity.User;
import com.authService.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }
}
