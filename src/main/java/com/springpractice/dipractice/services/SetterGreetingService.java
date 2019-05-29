package com.springpractice.dipractice.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "From Setter Greeting Service";
    }
}
