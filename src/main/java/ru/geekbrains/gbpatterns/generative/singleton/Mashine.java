package ru.geekbrains.gbpatterns.generative.singleton;

import ru.geekbrains.gbpatterns.generative.builder.Message;

public class Mashine implements Cloneable{
// пример паттерна prototype
    private Message message;

    public Mashine(){
    }


    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void work() {
//        final Singleton instance = Singleton.getInstance();
//        instance.work();
    }
// чтобы объект мог копировать самого себя, нужно переопределить метод clone() интерфейса Cloneable
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // здесь необходимо переопределять Cloneable для всех объектов  данного класса
        // иначе копирование будет "поверхностным"
        Mashine newMashine = (Mashine) super.clone();
        Message newMessage = (Message) super.clone();
        newMashine.setMessage(newMessage);
        return newMashine;
    }
}
