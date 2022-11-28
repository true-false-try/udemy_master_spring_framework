package com.spring.implementation;

import com.spring.interfaces.Speakers;
import com.spring.models.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Playing music with Sony speakers.";
    }

}
