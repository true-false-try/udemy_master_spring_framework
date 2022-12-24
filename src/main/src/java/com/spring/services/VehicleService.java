package com.spring.services;

import com.spring.interfaces.LogAspect;
import com.spring.interfaces.Speakers;
import com.spring.interfaces.Tyres;
import com.spring.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class VehicleService {
    private Logger log = Logger.getLogger(VehicleService.class.getName());
    public final Speakers speakers;
    private final Tyres tyres;

    @Autowired
    public VehicleService(Speakers speakers, Tyres tyres) {
        this.speakers = speakers;
        this.tyres = tyres;
    }
    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song) {

        return speakers.makeSound(song);
    }

    @LogAspect
    public String moveVehicle(boolean vehicleStarted) {

        return tyres.rotate();
        //throw new NullPointerException("Damn! NUll pointer exception occurred !!!");
    }
    @LogAspect
    public String applyBreak(boolean vehicleStated) {

        return tyres.stop();
    }

}
