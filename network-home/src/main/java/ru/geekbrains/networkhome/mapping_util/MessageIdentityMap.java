package ru.geekbrains.networkhome.mapping_util;

import ru.geekbrains.networkhome.model.Message;

import java.util.HashMap;
import java.util.Map;

public class MessageIdentityMap {
    private static MessageIdentityMap instance = new MessageIdentityMap();

    private Map<Long, Message> messageMap = new HashMap<>();

    public static void add(Message message){
        instance.messageMap.put(message.getId(), message);
    }

    public static Message get(Long id){
        return instance.messageMap.get(id);
    }

}
