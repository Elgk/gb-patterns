package ru.geekbrains.gbpatterns.behavoiral.state;

public class StateMain {
    public static void main(String[] args) {
         DocumentContext document = new DocumentContext();
        System.out.println(document.getIdocumentStatus());
        document.nextDocumentStatus(document);
        System.out.println(document.getIdocumentStatus());
        document.nextDocumentStatus(document);
        System.out.println(document.getIdocumentStatus());
        document.nextDocumentStatus(document);
        System.out.println(document.getIdocumentStatus());
    }
}
