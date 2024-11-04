package com.example.WouldYouPreferAnimeJava.classes;

public class Request {

    private String email;
    private String password;
    
    public void setEmail(String reqString){
        this.email = reqString;
    }

    public void setPassword(String reqString){
        this.password = reqString;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }
}
