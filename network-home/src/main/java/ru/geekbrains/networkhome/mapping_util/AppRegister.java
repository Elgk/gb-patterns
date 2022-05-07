package ru.geekbrains.networkhome.mapping_util;

import org.springframework.beans.factory.annotation.Autowired;

public class AppRegister {
    private static AppRegister instance = new AppRegister();

    protected MessageFinder messageFinder = new MessageFinder();

    public static AppRegister getInstance(){
        return instance;
    }

    public MessageFinder getMessageFinder() {
        return messageFinder;
    }
}
