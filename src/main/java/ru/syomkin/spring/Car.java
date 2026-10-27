package ru.syomkin.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    public Car() {
        System.out.println("Car constructor");
    }

    @Override
    public void startEngine() {
        System.out.println("Car: engine start!");
    }
}
