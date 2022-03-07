package ru.geekbrains.gbpatterns.factory;

public class CitilinkPriceProvider implements PriceProvider{
    @Override
    public Money getPrice(String article) {
        return Money.builder().rub(123).build();
    }
}
