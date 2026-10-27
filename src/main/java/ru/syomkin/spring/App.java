package ru.syomkin.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.syomkin.spring.config.PetConfiguration;
import ru.syomkin.spring.config.VehicleConfiguration;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Person person = context.getBean(Person.class);

        person.startVehicleEngine();
        person.callPat();

        context.close();
    }
}
