package ru.geekbrains.gbpatterns.behavoiral.template;

public class Cat implements Animal{
    @Override
    public void wakeUp() {

    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eate() {

    }

    @Override
    public void rest() {

    }

    @Override
    public void sleep() {

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.live();// выполняться все определенные методы в указанном порядке, как бы по шаблону
    }
}
