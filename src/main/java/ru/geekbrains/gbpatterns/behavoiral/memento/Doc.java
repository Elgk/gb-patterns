package ru.geekbrains.gbpatterns.behavoiral.memento;

//Originator
public class Doc {
    private String text = "";
    private int style = 1;

    public void addBlock(String text){
        this.text = text;
        System.out.println("block added: " + this.text);
    }

    public void setStyle(int style){
        if (this.style != style){
            this.style = style;
            System.out.println("The style was set: " + style);
        }
    }
    public void print(){
        System.out.println("Print: <" + text +">  with style: " + style);
    }

    public DocMemento saveState(){
        return new DocMemento(text, style);
    }

    public void restoreState(DocMemento docMemento){
        text = docMemento.getText();
        style = docMemento.getStyle();
    }
}
