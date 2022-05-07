package ru.geekbrains.networkhome.model;

import ru.geekbrains.networkhome.mapping_util.DomainObj;
import ru.geekbrains.networkhome.mapping_util.AppUnitOfWork;
import ru.geekbrains.networkhome.mapping_util.MessageMapper;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Message implements DomainObj {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sender;
    private String receiver;
    private String content;
    private LocalDateTime createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String recipient) {
        this.receiver = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String body) {
        this.content = body;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    @PrePersist
    public void init(){
        createAt = LocalDateTime.now();
    }

    public void markNew(){
        AppUnitOfWork.getCurrent().registryNew(this);
    }

    public void markDirty(){
        AppUnitOfWork.getCurrent().registryDirty(this);
    }

    public void markRemove(){
        AppUnitOfWork.getCurrent().registryRemoved(this);
    }


}
