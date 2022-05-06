package ru.geekbrains.networkhome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.networkhome.mapping_util.MessageFinder;
import ru.geekbrains.networkhome.model.Message;

@Service
public class MessageService {

    private final MessageFinder messageFinder;

    public MessageService(MessageFinder messageFinder){
        this.messageFinder = messageFinder;
    }

    public Message find(Long id){
        return messageFinder.find(id);
    }

    public Message create(String text, String sender, String receiver){
        Message message = new Message();
        message.setContent(text);
        message.setSender(sender);
        message.setReceiver(receiver);
        message.markNew();
        return message;
    }

    public void update(String text, Long id){
         Message message = messageFinder.find(id);
         message.setContent(text);
         message.markDirty();
    }

    public void delete(Long id){
        Message message = messageFinder.find(id);
        message.markRemove();
    }

}
