package com.spring.config;

import com.spring.models.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages = {
        "com.spring.implementation",
        "com.spring.services"
})
@ComponentScan("com.spring.models")
public class ProjectConfig {

}
