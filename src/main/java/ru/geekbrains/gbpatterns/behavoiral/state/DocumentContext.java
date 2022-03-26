package ru.geekbrains.gbpatterns.behavoiral.state;

public class DocumentContext {
    private IdocumentStatus idocumentStatus = new DocumentNew();

    public String getIdocumentStatus() {
        return idocumentStatus.getStatusDocument();
    }

    public void setIdocumentStatus(IdocumentStatus idocumentStatus) {
        this.idocumentStatus = idocumentStatus;
    }

    public void nextDocumentStatus(DocumentContext documentContext){
        idocumentStatus.nextStatus(documentContext);
    }

    public void previosDocumentStatus(DocumentContext documentContext){
        idocumentStatus.previosStatus(documentContext);
    }
}

