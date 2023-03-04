package com.example.demo.gamingspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {

    @Bean
    GameConsole marioGame (){
        return new MarioGame();
    }
//    @Bean
//    GameConsole superContraGame(){
//        return new SuperContraGame();
//    }

    @Bean
    GameRunner gameRunner(GameConsole marioGame){
        return new GameRunner(marioGame);
    }
}
