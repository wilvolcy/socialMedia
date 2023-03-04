package com.example.demo.gamingspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGaming {
    public static void main(String[] args) {
        try ( var context = new AnnotationConfigApplicationContext(GamingConfig.class);){
            context.getBean(GameConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
