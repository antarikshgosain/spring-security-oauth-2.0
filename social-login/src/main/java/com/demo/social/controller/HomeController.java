package com.demo.social.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String home(){
        return "Welcome to Home";
    }

    @GetMapping(value = "/secured")
    public String secured() {
        return "Welcome to Secured Home";
    }


}
