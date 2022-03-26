package ru.geekbrains.gbpatterns.behavoiral.state;

public interface IdocumentStatus {
    String getStatusDocument();
    void nextStatus(DocumentContext documentContext);
    void previosStatus(DocumentContext documentContext);
}
