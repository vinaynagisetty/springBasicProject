package com.example.spring_basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address){}
record Address(String firstLine,String city){}

@Configuration
public class HelloWordConfiguration {
    @Bean
    public String name(){
        return  "vinay";
    }
    @Bean
    public int age(){
        return  23;
    }
    @Bean
    public Person person(){
        return new Person("vinay1",231,new Address("vamsi","patancheru"));
    }
    @Bean
    public Person person2MethodCal(){
        return new Person(name(),age(),address());
    }
    @Bean
    public Person person3Parameter(String name,int age,Address adrees2){
        return new Person(name,age,adrees2);
    }
    @Bean(name="adrees2")
    public Address address(){
        return new Address("vinay","Hyderabed");
    }
    @Bean(name="adrees3")
    public Address address3(){
        return new Address("KUMAR","DElhi");
    }



}
