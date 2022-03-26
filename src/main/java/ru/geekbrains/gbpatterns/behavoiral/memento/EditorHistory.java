package ru.geekbrains.gbpatterns.behavoiral.memento;

import java.util.Stack;

//Caretaker
public class EditorHistory {
    private Stack<DocMemento> history;

    public Stack getHistory() {
        return history;
    }

    public EditorHistory() {
        this.history = new Stack();
    }

    public void  push(DocMemento docMemento){
        history.push(docMemento);
        System.out.println("Document is saved");
    }

    public DocMemento pop(){
        System.out.println("The last change is canceled");
        return  history.pop();
    }
}
