package com.example.WouldYouPreferAnimeJava.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/login")
public class userController {

    @GetMapping
    public List<String> login(@RequestBody Request myRequest){
        String name = myRequest.getemail();
        String password = myRequest.getpassword();
        return List.of(name, password);
    }
    
}

