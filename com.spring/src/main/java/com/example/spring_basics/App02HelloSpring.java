package com.example.spring_basics;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloSpring {
    public static void main(String[] args) {
     var context=  new AnnotationConfigApplicationContext(HelloWordConfiguration.class);
//

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCal"));
        System.out.println(context.getBean("person3Parameter"));
        System.out.println(context.getBean("adrees3"));
//        System.out.println(context.getBean(Address.class));

    }
}
