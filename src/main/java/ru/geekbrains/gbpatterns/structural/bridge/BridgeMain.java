package ru.geekbrains.gbpatterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Speedometr speedometr = new Speedometr();
        Altimeter altimeter = new Altimeter();

       measure(speedometr);
       measure(altimeter);
    }

    public static void measure(SensorImpl sensor){
        System.out.println("------------------");
        System.out.println("sensor: " + sensor.getClass().getName());
        BaseSensor baseSensor = new BaseSensor(sensor);
        AdvanceSensor advanceSensor = new AdvanceSensor(sensor, 5);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Current value: %f, average value: %f\n", baseSensor.getValue(), advanceSensor.getAverageValue());
        }
    }
}
