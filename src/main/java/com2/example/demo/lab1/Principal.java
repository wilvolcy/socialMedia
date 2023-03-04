package com2.example.demo.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class Principal {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(Principal.class)){
            System.out.println("The result is :" + context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
