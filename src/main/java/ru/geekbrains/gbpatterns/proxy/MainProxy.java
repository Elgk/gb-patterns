package ru.geekbrains.gbpatterns.proxy;

public class MainProxy {
    public static void main(String[] args) {
        CurrencyRateService currencyRateService = new ProxyCurrencyRateService();

        System.out.println(currencyRateService.getCurrencyRate("dollar"));
    }
}
