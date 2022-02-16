package ru.spring.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration // Java spring configuration with Java code and Annotations
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public KantryMusic kantryMusic() { return new KantryMusic(); }

    @Bean
    public List<Music> ganerMusic() { return Arrays.asList(classicalMusic(), rockMusic(), kantryMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(ganerMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
