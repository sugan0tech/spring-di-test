package com.example.springditest.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service
public class GreetingImplSpa implements Greeting {
    @Override
    public String sayGreeting() {
        return "Hola";
    }
}
