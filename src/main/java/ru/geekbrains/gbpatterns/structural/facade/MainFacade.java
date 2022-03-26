package ru.geekbrains.gbpatterns.structural.facade;

import ru.geekbrains.gbpatterns.structural.facade.videoconverter.VideoConverter;

public class MainFacade {
    public static void main(String[] args) {
        // класс Formatter доступен только внутри пакета videoconverter, поэтому для внешнего класса применяем "фасад" VideoConverter
        new VideoConverter();
    }
}
