package com.example.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.model.Users;
import com.example.springsecurity.service.UserService;

@RestController
public class UserController {


    @Autowired
    private UserService service;
    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        
        return service.register(user);
    }


    @PostMapping("/login")
    public String login(@RequestBody Users user){
        // System.out.println(user);
        // System.out.println("Received login request for user: " + user.getUsername());
        // System.out.println("Received login request for user: " + user.getPassword());
        return service.verify(user);
    } 
}
