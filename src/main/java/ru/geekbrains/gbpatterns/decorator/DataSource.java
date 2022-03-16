package ru.geekbrains.gbpatterns.decorator;

// общий интерфейс для базового класса и декоратора
public interface DataSource {

    void writeData(String data);

    String readData();
}
