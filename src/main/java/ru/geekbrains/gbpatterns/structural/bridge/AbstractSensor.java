package ru.geekbrains.gbpatterns.structural.bridge;

public abstract class AbstractSensor {
    protected SensorImpl sensorImpl; // это мост

    public AbstractSensor(SensorImpl sensorImpl) {
        this.sensorImpl = sensorImpl;
    }
}
