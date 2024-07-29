package com.example.spring_basics;

import com.example.spring_basics.game.GameRunner;
import com.example.spring_basics.game.GamingConsole;
import com.example.spring_basics.game.PackMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
//        var game=new MarioGame();
//        var  game= new SuperContraGame();
//        var game=new PackMan();
//        var gamerunner=new GameRunner(game);
//        gamerunner.run();

       var contex=new AnnotationConfigApplicationContext(GamingConfigurtion.class);
       contex.getBean(GamingConsole.class).up();
       contex.getBean((GameRunner.class)).run();
    }
}
