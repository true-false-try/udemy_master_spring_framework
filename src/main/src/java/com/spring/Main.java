package com.spring;

import com.spring.config.ProjectConfig;
import com.spring.models.Person;
import com.spring.models.Vehicle;
import com.spring.services.VehicleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleService v1 = context.getBean(VehicleService.class);
        VehicleService v2 = context.getBean(VehicleService.class);
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());

        if (v1 == v2) {
            System.out.println(BeanDefinition.SCOPE_SINGLETON);
        } else {
            System.out.println(BeanDefinition.SCOPE_PROTOTYPE);
        }








    }
}
