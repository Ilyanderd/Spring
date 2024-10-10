package com.ilyanders.spring;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog1 = context.getBean("myPet", Dog.class);
        dog1.setName("Belka");

        Dog dog2 = context.getBean("myPet", Dog.class);
        dog2.setName("Strelka");

        System.out.println("Ссылаются ли переменные на один и тот же объект? " + (dog1 == dog2));

        System.out.println(dog1);
        System.out.println(dog1.getName());

        System.out.println(dog2);
        System.out.println(dog2.getName());

        context.close();
    }
}
