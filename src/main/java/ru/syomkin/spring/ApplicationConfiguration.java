package ru.syomkin.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.syomkin.spring")
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {
}
