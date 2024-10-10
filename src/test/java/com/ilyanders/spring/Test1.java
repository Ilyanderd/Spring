package com.ilyanders.spring;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.XML");

        Person person = (Person) context.getBean("myPerson");
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        person.callYourPet();

        context.close();
    }
}
