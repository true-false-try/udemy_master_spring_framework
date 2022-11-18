package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Vehicle {
    private String name;

    @Bean(name = "audiVehicle")
    Vehicle vehicleOne() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean(value = "hondaVehicle")
    Vehicle vehicleTwo() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean("bmwVehicle")
    Vehicle vehicleThree() {
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
