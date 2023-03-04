package com4.example.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ConfigurationProperties configurationProperties;
    @GetMapping("/test")
    public String test(){
        return configurationProperties.toString();
    }
}
