package ru.geekbrains.gbpatterns.structural.bridge;

public class Altimeter implements SensorImpl{
    @Override
    public double getValue() {
        return 1 / Math.random();
    }
}
