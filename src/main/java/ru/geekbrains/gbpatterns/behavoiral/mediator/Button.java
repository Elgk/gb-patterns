package ru.geekbrains.gbpatterns.behavoiral.mediator;

public class Button extends Component{

    public Button(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void click() {
        mediator.notify(this, "Button was clicked");
    }
}
