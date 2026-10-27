package ru.syomkin.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Vehicle vehicle;

    public Person(@Qualifier("car") Vehicle vehicle) {
        this.vehicle = vehicle;
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
}
