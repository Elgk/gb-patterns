package ru.geekbrains.gbpatterns.facade;

import ru.geekbrains.gbpatterns.facade.videoconverter.VideoConverter;

public class MainFacade {
    public static void main(String[] args) {
        // класс Formatter доступен только внутри пакета videoconverter, поэтому для внешнего класса применяем "фасад" VideoConverter
        new VideoConverter();
    }
}
