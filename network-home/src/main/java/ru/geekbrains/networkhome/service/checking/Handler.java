package ru.geekbrains.networkhome.service.checking;

import ru.geekbrains.networkhome.model.User;

public interface Handler {
    void check(User user);
}
