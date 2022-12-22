package com.spring;

import com.spring.config.ProjectConfig;
import com.spring.models.Song;
import com.spring.services.VehicleService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleServices = context.getBean(VehicleService.class);

        System.out.println(vehicleServices.getClass());
        Song song = new Song();
        song.setTitle("Blanc Space");
        song.setSingerName("Taylor Swift");
        boolean vehicleStarted = true;

        String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
        String applyBrakeStatus = vehicleServices.applyBreak(vehicleStarted);








    }
}
