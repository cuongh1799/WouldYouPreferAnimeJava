package com.example.WouldYouPreferAnimeJava.controllers;

public class Request {

    private String email;
    private String password;
    
    public void setemail(String reqString){
        this.email = reqString;
    }

    public void setpassword(String reqString){
        this.password = reqString;
    }

    public String getemail(){
        return this.email;
    }

    public String getpassword(){
        return this.password;
    }
}
