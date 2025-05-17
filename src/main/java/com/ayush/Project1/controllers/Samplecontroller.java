package com.ayush.Project1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/sample")
public class Samplecontroller {

    @GetMapping("/hello")
    public String sayhello() {
        return "Hello  this is my first java spring boot program";
    }


}
