package ru.geekbrains.gbpatterns.behavoiral.chain;

public class BusyOperator implements Handler{


    @Override
    public void handler(Request request) {
        System.out.println("Your call is very important for us");
    }
}
