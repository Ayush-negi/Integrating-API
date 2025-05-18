package com.ayush.Project1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/sample")
public class Samplecontroller {

    @GetMapping("/hello/{name}")
    public String sayhello(@PathVariable("name") String name) {
        return "Hello  this is my first java spring boot program "+ name;
    }


}
