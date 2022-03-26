package ru.geekbrains.gbpatterns.structural.proxy;

public class MainProxy {
    public static void main(String[] args) {
        CurrencyRateService currencyRateService = new ProxyCurrencyRateService();

        System.out.println(currencyRateService.getCurrencyRate("dollar"));
    }
}
