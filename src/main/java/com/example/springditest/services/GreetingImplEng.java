package com.example.springditest.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingImplEng implements Greeting {
    @Override
    public String sayGreeting() {
        return "Hello";
    }
}
