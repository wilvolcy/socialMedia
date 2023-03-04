package com1.example.demo.gamingspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GameConsole {
    public void up(){
        System.out.println("up");
    }
    public void down(){
        System.out.println("Down");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("SHoot a bullet");
    }
}
