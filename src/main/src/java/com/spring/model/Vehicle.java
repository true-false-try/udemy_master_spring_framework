package com.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(
                "Printing Hello from Component Vehicle Bean"
        );
    }
}
