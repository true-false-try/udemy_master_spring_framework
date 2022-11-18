package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Vehicle.class);

        //Vehicle veh = context.getBean(Vehicle.class);  //NoUniqueBeanDefinitionException
        Vehicle vehOne = context.getBean("audiVehicle", Vehicle.class); // This part solved problem with definition bean because we used name's bean
        System.out.println("Vehicle name from Spring Context is: " + vehOne.getName());

        Vehicle vehTwo = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehTwo.getName());

        Vehicle vehThree = context.getBean("bmwVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehThree.getName());
    }
}
