package com.example.springditest.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingImplSpa implements Greeting {
    @Override
    public String sayGreeting() {
        return "Hola";
    }
}
