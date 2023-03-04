package com.example.demo.gamingjava;

public class GameRunner {
    GameConsole game;
    public GameRunner(GameConsole marioGame){
        this.game = marioGame;
    }
    public void run(){
        System.out.println(game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
