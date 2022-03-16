package ru.geekbrains.gbpatterns.bridge;

import java.util.ArrayDeque;
import java.util.Queue;

public class AdvanceSensor extends AbstractSensor{

    private Queue<Double> queue = new ArrayDeque<>();
    private final int n;

    public AdvanceSensor(SensorImpl sensorImpl, int n) {
        super(sensorImpl);
        this.n = n;
    }

    public Double getAverageValue(){
        queue.add(sensorImpl.getValue());
        if (queue.size() > n){
            queue.poll();
        }
        return queue.stream().mapToDouble(a -> a).average().orElse(0);
    }
}
