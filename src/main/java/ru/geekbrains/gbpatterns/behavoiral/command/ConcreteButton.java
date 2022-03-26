package ru.geekbrains.gbpatterns.behavoiral.command;

public class ConcreteButton implements Button{

    private Command command;
    private String url;


    public ConcreteButton(Command command) {
        this.command = command;
    }

    @Override
    public void press() {
        command.execute();
    }


}
