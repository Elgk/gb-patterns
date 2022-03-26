package ru.geekbrains.gbpatterns.behavoiral.mediator;

public class Dialog implements Mediator{

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof TextField){
            String text = ((TextField) sender).getText();
            System.out.println(text);
        }
        if (sender instanceof Button){

        }
    }
}
