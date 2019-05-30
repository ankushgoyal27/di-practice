package com.springpractice.dipractice.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetinngService implements GreetingService{

    @Override
    public String sayGreetings() {
        return "Servicio de Salude Primario";
    }
}
