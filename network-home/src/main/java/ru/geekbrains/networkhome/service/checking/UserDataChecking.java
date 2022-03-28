package ru.geekbrains.networkhome.service.checking;

import ru.geekbrains.networkhome.model.User;

public abstract class UserDataChecking implements Handler{
    protected Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void check(User user) {
    }
}
