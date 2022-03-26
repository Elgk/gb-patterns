package ru.geekbrains.gbpatterns.structural.proxy;

public class CbrRateService implements CurrencyRateService {
    @Override
    public double getCurrencyRate(String currency) {
      if (currency.equals("dollar")){
          return 90; // restTemplate ...
      }else if (currency.equals("euro")){
          return 110; // restTemplate...
      }
        return -1;
    }
}
