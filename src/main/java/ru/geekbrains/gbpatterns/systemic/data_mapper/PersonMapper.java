package ru.geekbrains.gbpatterns.systemic.data_mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper {
    private final Connection connection;

    public PersonMapper(Connection connection) {
        this.connection = connection;
    }

    public Person findById(long id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT ID, FIRSTNAME, LASTNAME, AGE FROM PERSON WHERE ID = ?");
        statement.setLong(1, id);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                return Person.builder()
                        .id(resultSet.getLong(1))
                        .lastName(resultSet.getString(3))
                        .firstName(resultSet.getString(2))
                        .age(resultSet.getInt(4))
                        .build();
            }
        }
        throw new RecordNotFoundException("Record personId = " + id + " not found");
    }
}
