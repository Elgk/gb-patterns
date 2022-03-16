package ru.geekbrains.gbpatterns.adapter;

public class Circle implements Roundable{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "<radius: " + radius + ">";
    }
}
