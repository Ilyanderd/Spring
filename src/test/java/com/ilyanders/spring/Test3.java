package com.ilyanders.spring;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog1 = context.getBean("myPet", Dog.class);
        dog1.saySomething();

        Dog dog2 = context.getBean("myPet", Dog.class);
        dog2.saySomething();

        context.close();
    }
}
