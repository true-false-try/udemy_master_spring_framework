package com.spring.models;

import com.spring.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {
    private String name = "AUDI";
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void getVehicleService() {
        vehicleService.playMusic();
        vehicleService.moveVehicle();
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}