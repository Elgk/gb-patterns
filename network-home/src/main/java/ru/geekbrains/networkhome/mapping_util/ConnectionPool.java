package ru.geekbrains.networkhome.mapping_util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

@Component
public class ConnectionPool {
    private Vector<Connection> freeConnections = new Vector<>();
    private Vector<Connection> activeConnections = new Vector<>();

    @Value("${sql.url}")
    private  String url;

    @Value("${sql.driver}")
    private   String driver;

    @Value("${sql.connection.count}")
    private  int connectionCount;

    public ConnectionPool(){
        try{
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < connectionCount; i++) {
            freeConnections.add(getConnection());
        }
    }

    private Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public synchronized Connection retrieve(){
        Connection newConnection = null;
        if (freeConnections.size() == 0){
            newConnection = getConnection();
        }else {
            newConnection = freeConnections.lastElement();
            freeConnections.remove(newConnection);
        }
        activeConnections.add(newConnection);
        return newConnection;
    }

    public synchronized void returnBack(Connection connection){
        if (connection != null){
            activeConnections.removeElement(connection);
            freeConnections.add(connection);
        }else{
            throw new NullPointerException("Соединение отсутствует");
        }
    }

    public int getAvailableConnectionCount(){
        return freeConnections.size();
    }
}
