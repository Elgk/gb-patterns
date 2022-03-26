package ru.geekbrains.gbpatterns.structural.decorator;

// общий интерфейс для базового класса и декоратора
public interface DataSource {

    void writeData(String data);

    String readData();
}
