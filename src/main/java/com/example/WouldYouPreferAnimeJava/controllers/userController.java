package com.example.WouldYouPreferAnimeJava.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WouldYouPreferAnimeJava.classes.Request;
import com.example.WouldYouPreferAnimeJava.classes.userRepository;
import com.example.WouldYouPreferAnimeJava.models.usersModel;

@RestController
@RequestMapping(path = "api/v1/login")
public class userController {

    @Autowired
    private userRepository UserRepository;
    
    @PostMapping
    public String test(@RequestBody Request myRequest){
        String email = myRequest.getEmail();
        String password = myRequest.getPassword();

        // Find user by email
        Optional<usersModel> user = UserRepository.findById(email); // Assuming email is the ID, adjust as needed

        // This doesnt work
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            System.out.println(user.get().getPassword());
            return "Found!";
            
        } else {
            System.out.println(user.get().getPassword());
            return "Not found!";
        }
    }
    
}

