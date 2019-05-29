package com.springpractice.dipractice.controller;

import com.springpractice.dipractice.services.GreetingService;
import com.springpractice.dipractice.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreetings();
    }
}
