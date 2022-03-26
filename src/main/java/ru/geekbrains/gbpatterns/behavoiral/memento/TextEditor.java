package ru.geekbrains.gbpatterns.behavoiral.memento;

public class TextEditor {

    public static void run(){
        Doc myDocument = new Doc();
        EditorHistory  history = new EditorHistory();

        myDocument.addBlock("Hello word!");
        myDocument.setStyle( 2);
        myDocument.print();

        history.push(myDocument.saveState());

        myDocument.addBlock("Hello word again!");
        myDocument.setStyle( 3);
        myDocument.print();

        myDocument.restoreState(history.pop());
        myDocument.print();
    }


}
