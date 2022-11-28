package com.spring;

import com.spring.config.ProjectConfig;
import com.spring.models.Person;
import com.spring.models.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("[BEFORE] retrieving the Person bean from the Spring Context");
        Person person = context.getBean(Person.class);
        System.out.println("[AFTER] retrieving the Person bean from the Spring Context");







    }
}
