package com.example.WouldYouPreferAnimeJava.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class usersModel {
    
    @Id
    private String id;
    private String email;
    private String password;

    public usersModel(){};

    public usersModel(String emailInput, String passwordInput){
        this.email = emailInput;
        this.password = passwordInput;
    }

    public String getId(){
        return this.id;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

}
