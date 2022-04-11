package ru.geekbrains.gbpatterns.systemic.money;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.spi.CurrencyNameProvider;

public class MoneyTest {
    public static void main(String[] args) {

        System.out.println(0.1 + 0.2 == 0.3);// потому, что 0.1 + 0.2 = 0.300000000000000000004

        System.out.println(BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2)).equals(BigDecimal.valueOf(0.3)));
    }
}
