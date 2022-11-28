package com.spring.implementation;

import com.spring.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "Playing music with BridgeStone speakers.";
    }
}
