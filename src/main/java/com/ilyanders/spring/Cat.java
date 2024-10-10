package com.ilyanders.spring;

/*@Component*/
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void saySomething() {
        System.out.println("Meow");
    }
}
