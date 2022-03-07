package ru.geekbrains.gbpatterns.factory;

public interface ExchangeFactory {
    PriceProvider createPriceProvider();
    MarketingProvider createMarketingProvider();
    DocProvider createDocProvider();
}
