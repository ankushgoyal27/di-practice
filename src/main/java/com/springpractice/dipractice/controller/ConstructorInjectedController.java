package com.springpractice.dipractice.controller;


import com.springpractice.dipractice.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }

    @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
