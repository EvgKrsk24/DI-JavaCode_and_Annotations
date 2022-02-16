package ru.spring.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> ganerMusic; // внедрение бина

    public MusicPlayer(List<Music> ganerMusic) {
        this.ganerMusic=ganerMusic;    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();
        int rnd = random.nextInt(ganerMusic.size()); // random for MusicStyle
        return "Playing: " + ganerMusic.get(rnd).getSong();
    }
}
