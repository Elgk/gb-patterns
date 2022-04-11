package ru.geekbrains.gbpatterns.systemic.money;

import java.math.BigDecimal;
import java.util.Currency;

public class Money {

    private final Currency currency;
    private final BigDecimal amount;
    public Money(Currency currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = BigDecimal.valueOf(amount).stripTrailingZeros();
    }

    public Money add(Money value){

        if (currency != value.currency){
            return null;
        }
        else {
            Money money = new Money(currency, amount.add(value.amount));
            return money;
        }
    }
}
