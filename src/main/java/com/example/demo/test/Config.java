package com.example.demo.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    record Person(String name, String email){};
    record Person2(String name, String email, Address address){};
    record Address(String state, String city){}

    @Bean
    Person person(){
        return  new Person("Volcy", "datts@gmail.com");
    }
    @Bean(name = "address2")
    Address address(){
        return new Address("FL","Harmony");
    }

    @Bean
    Person2 person2 (){
        return new Person2("jean","person2@gmail.com",new Address("MN","Lyndale"));
    }

}
