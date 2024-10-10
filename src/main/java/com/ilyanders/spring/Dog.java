package com.ilyanders.spring;

/*@Component*/
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@PostConstruct*/
    public void init() {
        System.out.println("Dog init");
    }

    /*@PreDestroy*/
    public void destroy() {
        System.out.println("Dog destroy");
    }

    @Override
    public void saySomething() {
        System.out.println("I'm a dog");
    }
}
