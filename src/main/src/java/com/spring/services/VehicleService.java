package com.spring.services;

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

    public String playMusic(boolean vehicleStarted, Song song) {
        Instant start = Instant.now();
        log.info("method execution start");
        String music = null;
        if (!vehicleStarted) {
            music = speakers.makeSound(song);
        } else {
            log.log(Level.SEVERE, "Vehicle not started perform the operation");
        }
        log.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method " + timeElapsed);

        return music;
    }

    public String moveVehicle(boolean vehicleStarted) {
        Instant start = Instant.now();
        log.info("method execution start");
        String status = null;
        if (vehicleStarted) {
            status = tyres.stop();
        } else {
            log.log(Level.SEVERE, "Vehicle not started perform the operation");
        }
        log.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method " + timeElapsed);

        return status;

    }

    public String applyBreak(boolean vehicleStated) {
        Instant start = Instant.now();
        log.info("method execution start");
        String status = null;
        if (vehicleStated) {
            status = tyres.rotate();
        } else {
            log.log(Level.SEVERE, "Vehicle not started perform the operation");
        }
        log.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method " + timeElapsed);

        return status;
    }

    public Speakers getSpeakers() {
        return speakers;
    }


    public Tyres getTyres() {
        return tyres;
    }


}
