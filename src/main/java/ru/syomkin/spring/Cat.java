package ru.syomkin.spring;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    public Cat() {
        System.out.println("Cat is created");
    }

    public String getName() {
        return "Musya";
    }
}
