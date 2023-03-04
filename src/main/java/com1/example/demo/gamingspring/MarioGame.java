package com1.example.demo.gamingspring;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go to a hole");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Go to the right");
    }
}
