package ru.geekbrains.gbpatterns.bridge;

public class BaseSensor extends AbstractSensor{

    public BaseSensor(SensorImpl sensorImpl) {
        super(sensorImpl);
    }

    public double getValue(){
        return sensorImpl.getValue();
    }
}
