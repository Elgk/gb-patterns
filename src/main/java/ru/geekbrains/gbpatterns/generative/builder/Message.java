package ru.geekbrains.gbpatterns.generative.builder;

import java.time.LocalDateTime;

public class Message implements Cloneable{
    String sender;
    String reciever;
    LocalDateTime createdAt;

    public Message() {

    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // для примера паттерна prototype
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private Message message;

        public Builder(){
            this.message = new Message();
        }

        public Builder sender(String name){
            message.setSender(name);
            return this;
        }

        public Builder reciever(String name){
            message.setReciever(name);
            return this;
        }

        public Builder createdAt(LocalDateTime dateTime){
            message.setCreatedAt(dateTime);
            return this;
        }
         public Message build(){
            return message;
         }
    }

    public static void main(String[] args) {
        Message.Builder bilder = new Builder()
                .sender("Bill")
                .reciever("John");
        prosses(bilder);
        //repository.save(bilder.build()); // создается и сохраняется объект типа Message, например в БД

    }

    public static void prosses(Message.Builder builder){
        builder.createdAt(LocalDateTime.now());// можно добавить дополнительную логику
    }
}
