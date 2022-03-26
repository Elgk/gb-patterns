package ru.geekbrains.gbpatterns.behavoiral.state;

public class DocumentDelievered implements IdocumentStatus {
    @Override
    public String getStatusDocument() {
        return StatusName.DELIEVERED.getStatusName();
    }

    @Override
    public void nextStatus(DocumentContext documentContext) {
        System.out.println("nextDocumStatus NOTHING happens");
    }

    @Override
    public void previosStatus(DocumentContext documentContext) {
        documentContext.setIdocumentStatus(new DocumentSend());
    }
}
