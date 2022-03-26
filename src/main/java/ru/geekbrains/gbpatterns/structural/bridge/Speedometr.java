package ru.geekbrains.gbpatterns.structural.bridge;

public class Speedometr implements SensorImpl {
    @Override
    public double getValue() {
        return Math.random();
    }
}
