package ru.geekbrains.gbpatterns.bridge;

public abstract class AbstractSensor {
    protected SensorImpl sensorImpl; // это мост

    public AbstractSensor(SensorImpl sensorImpl) {
        this.sensorImpl = sensorImpl;
    }
}
