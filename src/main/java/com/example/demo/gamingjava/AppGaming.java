package com.example.demo.gamingjava;

public class AppGaming {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
//        var gameRunner = new GameRunner(marioGame);
        var gameRunner = new GameRunner(superContraGame);

        gameRunner.run();
    }
}
