package ru.geekbrains.gbpatterns.bridge;

public class Speedometr implements SensorImpl {
    @Override
    public double getValue() {
        return Math.random();
    }
}
