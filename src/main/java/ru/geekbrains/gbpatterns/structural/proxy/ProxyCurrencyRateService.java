package ru.geekbrains.gbpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyCurrencyRateService implements CurrencyRateService {
    private final CbrRateService wrapping = new CbrRateService();

    private final Map<String, Double> currencies = new HashMap<>();

    @Override
    public double getCurrencyRate(String currency) {
         currencies.compute(currency, (k,v) -> {
            if (v == null){
                 double rate = wrapping.getCurrencyRate(k);
                 currencies.put(k, rate);
                 return  rate;
            }else {
               return v;
            }
        });
         return -1;
    }
}
