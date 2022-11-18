package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Vehicle.class);
        //Vehicle veh = context.getBean(Vehicle.class);  //NoUniqueBeanDefinitionException
        Vehicle veh = context.getBean("vehicleOne", Vehicle.class); // This part solved problem with definition bean because we used name's bean
        System.out.printf("Vehicle name from Spring Context is: " + veh.getName());
    }
}
