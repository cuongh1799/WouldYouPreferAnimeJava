package com.example.WouldYouPreferAnimeJava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/testing")
public class userController {

    @GetMapping
    public String testingApi(){
        return "Api called";
    }
    
}
