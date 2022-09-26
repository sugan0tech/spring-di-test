package com.example.springditest.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingImplTam implements Greeting {
    @Override
    public String sayGreeting() {
        return "Vanakkam";
    }
}
