package ru.syomkin.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnector {
    @Value("${database-connector.host}")
    private String databaseHost;

    @Value("${database-connector.port}")
    private String databasePort;

    @Value("${database-connector.credentials.user}")
    private String databaseUser;

    @Value("${database-connector.credentials.password}")
    private String databasePassword;

    public void executeSql() {
        System.out.println("Sql...");

        System.out.println("Host: " + databaseHost);
        System.out.println("Port: " + databasePort);
        System.out.println("User: " + databaseUser);
        System.out.println("Password: " + databasePassword);
    }
}
