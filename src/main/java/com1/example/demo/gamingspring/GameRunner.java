package com1.example.demo.gamingspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GameConsole game;
    public GameRunner(GameConsole marioGame){
        this.game = marioGame;
    }
    public void run(){
        System.out.println("Running game : " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
