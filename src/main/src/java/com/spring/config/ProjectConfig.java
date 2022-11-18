package com.spring.config;

import com.spring.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "audiVehicle")
    Vehicle vehicleOne() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Primary
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
}
