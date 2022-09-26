package com.example.springditest.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"TN", "default"})
@Service
public class GreetingImplTam implements Greeting {
    @Override
    public String sayGreeting() {
        return "Vanakkam";
    }
}
