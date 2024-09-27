package com.example.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class Home {
    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Learning Spring Security"+request.getSession().getId();
    }
}
