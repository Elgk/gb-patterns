package ru.geekbrains.gbpatterns.factory;

public interface PriceProvider {
    Money getPrice(String article);
}
