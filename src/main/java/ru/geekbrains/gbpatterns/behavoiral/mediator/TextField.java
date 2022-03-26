package ru.geekbrains.gbpatterns.behavoiral.mediator;

public class TextField extends Component{
    private String text = "text";

    public TextField(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void click() {
        mediator.notify(this, "text was entered");
    }

    public String getText() {
        return text;
    }
}
