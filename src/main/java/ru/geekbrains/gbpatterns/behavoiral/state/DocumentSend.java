package ru.geekbrains.gbpatterns.behavoiral.state;

public class DocumentSend implements IdocumentStatus {
    @Override
    public String getStatusDocument() {
        return StatusName.SEND.getStatusName();
    }

    @Override
    public void nextStatus(DocumentContext documentContext) {
        documentContext.setIdocumentStatus(new DocumentDelievered());
    }

    @Override
    public void previosStatus(DocumentContext documentContext) {
        documentContext.setIdocumentStatus(new DocumentNew());
    }
}
