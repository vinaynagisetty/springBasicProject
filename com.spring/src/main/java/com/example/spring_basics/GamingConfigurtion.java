package com.example.spring_basics;

import com.example.spring_basics.game.GameRunner;
import com.example.spring_basics.game.GamingConsole;
import com.example.spring_basics.game.PackMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfigurtion {
    @Bean
    public GamingConsole game(){
        var game=new PackMan();
        return game;
    }
    @Bean
    public GameRunner gamerunner(GamingConsole game){
        var gamerunner=new GameRunner(game);
        return gamerunner;
    }

}
