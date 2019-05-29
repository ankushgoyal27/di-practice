package com.springpractice.dipractice.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HEY_SPRING = "Hey Spring!!!";

    @Override
    public String sayGreetings() {
        return HEY_SPRING;
    }
}
