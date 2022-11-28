package com.spring;

import com.spring.config.ProjectConfig;
import com.spring.models.Person;
import com.spring.models.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);

        String[] names = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        //vehicle.getVehicleService();

        person.getVehicle().getVehicleService();







    }
}
