package ru.geekbrains.gbpatterns.generative.factory;

public class CitilinkExchangeFactory implements ExchangeFactory {
    @Override
    public PriceProvider createPriceProvider() {
        return new CitilinkPriceProvider();
    }

    @Override
    public MarketingProvider createMarketingProvider() {
        return new CitilinkMarketingProvider();
    }

    @Override
    public DocProvider createDocProvider() {
        return new CitilinkDocProvider();
    }
}
