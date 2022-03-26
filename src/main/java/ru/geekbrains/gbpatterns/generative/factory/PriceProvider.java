package ru.geekbrains.gbpatterns.generative.factory;

public interface PriceProvider {
    Money getPrice(String article);
}
