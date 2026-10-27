package ru.syomkin.spring;

import org.springframework.stereotype.Component;

public class Motorbike implements  Vehicle {
    public Motorbike() {
        System.out.println("Motorbike constructor");
    }

    @Override
    public void startEngine() {
        System.out.println("Motorbike engine start!");
    }
}
