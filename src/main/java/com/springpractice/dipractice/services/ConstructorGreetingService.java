package com.springpractice.dipractice.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "From Constructor Service";
    }
}
