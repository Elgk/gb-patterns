package ru.geekbrains.gbpatterns.generative.builder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.gbpatterns.generative.builder.Message;

@RestController("/hello")
public class HelloController {

    @GetMapping
    public String hello(String sender, String reciever){
        Message.Builder builder = Message.builder()
                .sender(sender)
                .reciever(reciever);
        Message message = builder.build();

        return "Hello";
    }
}
