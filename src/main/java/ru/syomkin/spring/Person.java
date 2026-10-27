package ru.syomkin.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Person {
    private Vehicle vehicle;
    private Dog dog;

    public Person(@Qualifier("car") Vehicle vehicle, Dog dog) {
        this.vehicle = vehicle;
        this.dog = dog;
        System.out.println("Person constructor");
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Set new value to vehicle");
    }

    public void startVehicleEngine() {
        System.out.println("Person: start vehicle engine");
        this.vehicle.startEngine();
    }

    public void callPat() {
        System.out.println("Call pat!");
        System.out.println(dog.getName() + " come to me");
    }
}
