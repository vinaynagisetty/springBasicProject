package com.example.spring_basics.game;

public class GameRunner {
//  private  MarioGame game;
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game=game;
    }

    public void run() {
        System.out.println(game);
        game.down();
        game.left();
        game.up();
        game.right();
    }
}
