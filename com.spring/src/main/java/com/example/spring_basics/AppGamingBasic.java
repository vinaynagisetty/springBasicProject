package com.example.spring_basics;

import com.example.spring_basics.game.GameRunner;
import com.example.spring_basics.game.MarioGame;
import com.example.spring_basics.game.PackMan;
import com.example.spring_basics.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {
//        var game=new MarioGame();
//        var  game= new SuperContraGame();
        var game=new PackMan();
        var gamerunner=new GameRunner(game);
        gamerunner.run();
    }
}
