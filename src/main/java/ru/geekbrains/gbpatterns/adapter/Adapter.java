package ru.geekbrains.gbpatterns.adapter;

public class Adapter implements Roundable{

    private  final Square delegate;

    public Adapter(Square delegate) {
        this.delegate = delegate;
    }

    @Override
    public double getRadius() {
        return delegate.getSide() * Math.sqrt(2)/2;
    }

    @Override
    public String toString() {
        return "<radius: " + getRadius() + " side:" + delegate.getSide() + ">";
    }
}
