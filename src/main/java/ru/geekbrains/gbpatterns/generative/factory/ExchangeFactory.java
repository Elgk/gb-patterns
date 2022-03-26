package ru.geekbrains.gbpatterns.generative.factory;

public interface ExchangeFactory {
    PriceProvider createPriceProvider();
    MarketingProvider createMarketingProvider();
    DocProvider createDocProvider();
}
