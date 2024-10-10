package com.ilyanders.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")/*
@ComponentScan("com.ilyanders.spring")*/
public class MyConfig {
    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Dog dogBean() {
        return new Dog();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
