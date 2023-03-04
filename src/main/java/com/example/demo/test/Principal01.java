package com.example.demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal01 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        //get the bean by type
        String [] a = {"name ","Volcy"};
        System.out.println(context.getBean(Config.Address.class));
        String [] names = context.getBeanDefinitionNames();

    }
}
