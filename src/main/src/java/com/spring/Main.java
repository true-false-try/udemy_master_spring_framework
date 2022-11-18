package com.spring;

import com.spring.config.ProjectConfig;
import com.spring.model.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Vehicle veh = context.getBean(Vehicle.class);  //NoUniqueBeanDefinitionException
        Vehicle vehOne = context.getBean(Vehicle.class); // This part solved problem with definition bean because we used name's bean
        System.out.println("Primary Vehicle name from Spring Context is: " + vehOne.getName());

    }
}
