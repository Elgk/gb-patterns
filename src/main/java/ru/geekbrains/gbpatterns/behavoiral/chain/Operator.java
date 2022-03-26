package ru.geekbrains.gbpatterns.behavoiral.chain;

public class Operator implements Handler{
    private Handler next;

    public Operator(Handler next, String name) {
       this.next = next;
        this.name = name;
    }

    private String name;



    @Override
    public void handler(Request request) {
        if (isBusy()){
            System.out.println("Operator " + name + " is busy");
            if (next != null){
//                next.handler(request);
            }
        }else {
            System.out.println("Your request: " + request.getData() + " is being processed");
        }

    }

    private boolean isBusy(){
        return Math.random() < 0.9;
    }
}
