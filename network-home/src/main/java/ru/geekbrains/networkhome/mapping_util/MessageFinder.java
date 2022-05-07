package ru.geekbrains.networkhome.mapping_util;

import org.springframework.stereotype.Component;
import ru.geekbrains.networkhome.model.Message;

@Component
public class MessageFinder {

    public MessageFinder() {
    }

     public Message find(Long id){
         Message message = MessageIdentityMap.get(id);
         if (message == null){
             message = (Message) MapperRegistry.getInstance().getMapper(Message.class).findById(id);
             MessageIdentityMap.add(message);
         }
         return message;
     }
}
