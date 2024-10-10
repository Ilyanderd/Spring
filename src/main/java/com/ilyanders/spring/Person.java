package com.ilyanders.spring;

import org.springframework.beans.factory.annotation.Value;

/*@Component*/
public class Person {
    private Pet pet;

    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }

 /*   @Autowired*/
    public Person(/*@Qualifier("cat")*/ Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.saySomething();
    }
}
