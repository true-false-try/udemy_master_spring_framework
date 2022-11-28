package com.spring.implementation;

import com.spring.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with Michelin tyres.";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of Michelin tyres";
    }
}
