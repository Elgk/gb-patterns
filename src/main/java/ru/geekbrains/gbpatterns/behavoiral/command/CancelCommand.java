package ru.geekbrains.gbpatterns.behavoiral.command;

public class CancelCommand implements Command{
    private SomeService service;

    @Override
    public void execute() {
        service.cancel();
    }
}
