package com.example.WouldYouPreferAnimeJava.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.mongodb.core.query.BasicQuery;

import com.example.WouldYouPreferAnimeJava.classes.Request;
import com.example.WouldYouPreferAnimeJava.classes.userRepository;
import com.example.WouldYouPreferAnimeJava.models.usersModel;

@RestController
@RequestMapping(path = "api/v1/login")
public class userController {

    @Autowired
    private userRepository UserRepository;
    
    @PostMapping
    public ResponseEntity<String> test(@RequestBody Request myRequest){
        String email = myRequest.getEmail();
        String password = myRequest.getPassword();
        usersModel reqAccount = new usersModel(email, password);

        // Find user by email
        usersModel user = (UserRepository.findByEmail(email));

        // This doesnt work
        if (user.getPassword().equals(password)) {
            System.out.println(user.getPassword());
            return new ResponseEntity<>("Login Successful", HttpStatus.OK);
            
        } else {
            return new ResponseEntity<>("Login Failed", HttpStatusCode.valueOf(404));
        }
    }
    
}

