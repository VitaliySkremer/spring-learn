package ru.syomkin.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.syomkin.spring");

        Person person = context.getBean(Person.class);
        person.startVehicleEngine();

        Parking parking = context.getBean(Parking.class);

        for (Map.Entry<String, Vehicle> entry : parking.getVehicleMap().entrySet()) {
            String key = entry.getKey();
            Vehicle vehicle = entry.getValue();

            System.out.println(key);
            vehicle.startEngine();
        }

        context.close();
    }
}
