package com.study.zqwstudy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MainConfig.class); //1

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class); //2

        System.out.println(useFunctionService.SayHello("world"));
        System.out.println(useFunctionService.SayHello("world2"));
        System.out.println(useFunctionService.SayHello("world3"));

        System.out.println("hello world1");
        System.out.println("hello world2");
        System.out.println("hello world3");
        System.out.println("hello world4");


        context.close();
    }
}
