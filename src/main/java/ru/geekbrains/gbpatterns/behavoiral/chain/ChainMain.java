package ru.geekbrains.gbpatterns.behavoiral.chain;

public class ChainMain {
    public static void main(String[] args) {
        Handler handler;
        handler = new Operator(new Operator(new Operator(new Operator(new BusyOperator(),"Ann"), "Kate"),
                "Bob"), "Mike");
        for (int i = 0; i < 10; i++) {
            handler.handler(new Request("Test"));
        }
    }
}
