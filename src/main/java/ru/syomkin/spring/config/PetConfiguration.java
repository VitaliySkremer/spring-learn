package ru.syomkin.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.syomkin.spring.Dog;

@Configuration
public class PetConfiguration {

    @Bean
    public Dog dog() {
        return new Dog();
    }
}
