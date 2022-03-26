package ru.geekbrains.gbpatterns.behavoiral.state;

public class DocumentNew implements IdocumentStatus{
    @Override
    public String getStatusDocument() {
       return StatusName.NEW.getStatusName();
    }

    @Override
    public void nextStatus(DocumentContext documentContext) {
        documentContext.setIdocumentStatus(new DocumentSend());
    }

    @Override
    public void previosStatus(DocumentContext documentContext) {
        System.out.println("previosDocumStatus NOTHING happens");
    }
}
