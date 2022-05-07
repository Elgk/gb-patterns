package ru.geekbrains.networkhome.mapping_util;

import org.springframework.stereotype.Component;
import ru.geekbrains.networkhome.exception.NotFoundException;
import ru.geekbrains.networkhome.model.Message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MessageMapper implements DomainObjMapper<Message>{
    private final ConnectionManager connectionManager;
    private Connection currentConnection;

    public MessageMapper(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
        currentConnection = connectionManager.getConnection();
    }

    public void insert(Message message){
        PreparedStatement statement = null;
        try {
            statement = currentConnection.prepareStatement(
                    "INSERT INTO message (sender, recipient, content) VALUES (?,?,?);" );
            statement.setString(1, message.getSender());
            statement.setString(2, message.getReceiver());
            statement.setString(3, message.getContent());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Message message){
        try {
            PreparedStatement statement = currentConnection.prepareStatement(
                    "UPDATE message SET content = ? WHERE id = ?;");
            statement.setString(1, message.getContent());
            statement.setLong(2, message.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Message message){
        PreparedStatement statement = null;
        try {
            statement = currentConnection.prepareStatement(
                    "DELETE FROM message WHERE id = ?;" );
            statement.setLong(1, message.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Message findById(Long id){
        try {
            PreparedStatement statement = currentConnection.prepareStatement(
                    "SELECT id, sender, redipient, content FROM message WHERE id = ?;" );
            statement.setLong(1, id);
            try(ResultSet resultSet = statement.executeQuery()){
                while (resultSet.next()){
                    Message newMessage = new Message();
                    newMessage.setId(resultSet.getLong(1));
                    newMessage.setSender(resultSet.getString(2));
                    newMessage.setReceiver(resultSet.getString(3));
                    newMessage.setContent(resultSet.getString(4));
                    return newMessage;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new NotFoundException("Message with id = " + id + " not found");
    }
}
