package ru.geekbrains.gbpatterns.behavoiral.template;

public interface Animal {
    void wakeUp();
    void makeSound();
    void eate();
    void rest();
    void sleep();

    default void live(){
        wakeUp();
        makeSound();
        eate();
        rest();
        sleep();
    }
}
