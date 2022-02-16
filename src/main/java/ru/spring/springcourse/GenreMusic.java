package ru.spring.springcourse;

import java.util.List;

public class GenreMusic {

    private List ganerMusic;
    private Music music;
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;
    private KantryMusic kantryMusic;

    public GenreMusic(RockMusic rockMusic, ClassicalMusic classicalMusic, KantryMusic kantryMusic) {
        ganerMusic.add(rockMusic);
        ganerMusic.add(classicalMusic);
        ganerMusic.add(kantryMusic);

    }

}
