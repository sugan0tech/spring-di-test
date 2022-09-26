package com.example.springditest.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service
public class GreetingImplEng implements Greeting {
    @Override
    public String sayGreeting() {
        return "Hello";
    }
}
