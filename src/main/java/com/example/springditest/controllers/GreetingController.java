package com.example.springditest.controllers;


import com.example.springditest.services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    private final Greeting greeting;

    @Autowired
    public GreetingController(Greeting greeting) {
        this.greeting = greeting;
    }
}
