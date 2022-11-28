package com.spring.implementation;

import com.spring.interfaces.Speakers;
import com.spring.models.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Playing music with Bose speakers.";
    }

}
