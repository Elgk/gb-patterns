package ru.geekbrains.gbpatterns.behavoiral.command;

public class CommandMain {
    public static void main(String[] args) {
        Button saveButton = new ConcreteButton(new SaveCommand());
        Button cancelButton = new ConcreteButton(new CancelCommand());
    }
}
