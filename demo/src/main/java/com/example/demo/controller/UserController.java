package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUserId/{id}")
    public User getUserById(@PathVariable("id") int id) throws Exception{
        return userService.getUserById(id).get();
    }

    @PostMapping("saveUser")
    @Operation(summary = "Save user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
