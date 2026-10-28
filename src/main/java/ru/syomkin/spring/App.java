package ru.syomkin.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        DatabaseConnector connector = context.getBean(DatabaseConnector.class);
        connector.executeSql();

        context.close();
    }
}
