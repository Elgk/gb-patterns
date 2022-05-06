package ru.geekbrains.networkhome.mapping_util;

import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
public class ConnectionManager {
    private final ConnectionPool connectionPool;
    private Connection connection;

    public ConnectionManager(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public Connection getConnection(){
        connection = connectionPool.retrieve();
        return connection;
    }

    public void disconnect(){
        connectionPool.returnBack(connection);
    }

}
