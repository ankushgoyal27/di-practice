package com.springpractice.dipractice.controller;


import com.springpractice.dipractice.services.GreetingService;
import com.springpractice.dipractice.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;


    public String sayHello(){
        return greetingService.sayGreetings();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
