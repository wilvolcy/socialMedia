package com1.example.demo.gamingspring;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com1.example.demo.gamingspring")
public class AppGaming {
//    @Bean
//    GameConsole marioGame (){
//        return new MarioGame();
//    }

//    @Bean
//    GameRunner gameRunner(GameConsole marioGame){
//        return new GameRunner(marioGame);
//    }
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppGaming.class);){
            context.getBean(GameConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
