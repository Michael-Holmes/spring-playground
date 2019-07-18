package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello from Spring 3!";
    }

    @GetMapping("/pi")
    public String printPi() {
        return "3.141592653589793";
    }

}

