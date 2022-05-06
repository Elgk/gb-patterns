package ru.geekbrains.networkhome.controller;

import org.springframework.web.bind.annotation.*;
import ru.geekbrains.networkhome.mapping_util.AppUnitOfWork;
import ru.geekbrains.networkhome.model.Message;
import ru.geekbrains.networkhome.service.MessageService;

@RestController
@RequestMapping("/message")
public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/{id}")
    public Message findMessage(@PathVariable Long id){
        AppUnitOfWork.newCurrent();
        return messageService.find(id);

    }

    @PostMapping
    public Message createMessage(@RequestBody Message message){
       return messageService.create(message.getContent(), message.getSender(), message.getReceiver());

    }

    @PutMapping
    public void updateMessage(@RequestBody Message message){
        messageService.update(message.getContent(), message.getId());

    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id){
        messageService.delete(id);
    }

    @GetMapping("/save/{id}")
    public void saveMessage(@PathVariable Long id){
        AppUnitOfWork.getCurrent().commit();
    }
}
