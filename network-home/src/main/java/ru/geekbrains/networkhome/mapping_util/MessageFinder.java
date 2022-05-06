package ru.geekbrains.networkhome.mapping_util;

import org.springframework.stereotype.Component;
import ru.geekbrains.networkhome.model.Message;

@Component
public class MessageFinder {

    private final ConnectionManager connectionManager;

    public MessageFinder(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

     public Message find(Long id){
         Message message = MessageIdentityMap.get(id);
         if (message == null){
          //   message =  MapperRegistry.getInstance().getMapper(Message.class).findById(id);
             MessageMapper mapper = new MessageMapper(connectionManager);
             message = mapper.findById(id);
             MessageIdentityMap.add(message);

         }
         return message;
     }
}
