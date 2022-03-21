package ru.geekbrains.networkhome.service;

import ru.geekbrains.networkhome.model.User;

import java.util.List;

public interface FindUsers {
    List<User> findAll();

    List<User> findByLastName(String name);
}
