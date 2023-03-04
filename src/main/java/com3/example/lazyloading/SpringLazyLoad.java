package com3.example.lazyloading;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{}
@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA ){
        System.out.println("3- Instance of class B is created");
        this.classA = classA;
    }
    public void doSomething(){
        System.out.println("4- Do some thing");
    }
}
@ComponentScan
@Configuration
public class SpringLazyLoad {
    public static void main(String[] args) {
        System.out.println("1- Before create the context ");
        try(var context = new AnnotationConfigApplicationContext(SpringLazyLoad.class)){
            System.out.println("2- After Create the context ");
            context.getBean(ClassB.class).doSomething();
        }
    }
}
