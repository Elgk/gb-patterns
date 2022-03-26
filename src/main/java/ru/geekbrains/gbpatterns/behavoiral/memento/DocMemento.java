package ru.geekbrains.gbpatterns.behavoiral.memento;

//Memento
public class DocMemento {
    private String text;
    private int style;

    public DocMemento(String text, int style) {
        this.text = text;
        this.style = style;
    }

    public String getText() {
        return text;
    }

    private void setText(String text) {
        this.text = text;
    }

    public int getStyle() {
        return style;
    }

    private void setStyle(int style) {
        this.style = style;
    }
}
