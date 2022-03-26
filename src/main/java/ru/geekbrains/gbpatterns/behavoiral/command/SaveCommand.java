package ru.geekbrains.gbpatterns.behavoiral.command;

public class SaveCommand implements Command {
    private SomeService service;


    @Override
    public void execute() {
        service.save();
    }
}
