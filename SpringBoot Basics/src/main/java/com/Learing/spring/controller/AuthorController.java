package com.Learing.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    private String name = "Ajay";
    private String email = "ajayd@codetantra.in";
    private String phone = "1234567890";

    @GetMapping("/author")
    public String getAuthorDetails() {
        return "<h2>Author Details</h2>" +
               "<p><b>Name:</b> " + name + "</p>" +
               "<p><b>Email:</b> " + email + "</p>" +
               "<p><b>Phone:</b> " + phone + "</p>";
    }

    @GetMapping("/author/name")
    public String getAuthorName(){
        return name;
    }
}
