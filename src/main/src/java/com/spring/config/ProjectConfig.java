package com.spring.config;

import com.spring.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan("com.spring.model")
public class ProjectConfig {

    @Bean
    Vehicle audi() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    @Primary
    Vehicle honda() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle ferrari() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }


}
