package ru.geekbrains.gbpatterns.behavoiral.strategy;

public class CreditCardStrategy implements PaymentStratedy {
    private String cardNumber;
    private String cvv;
    private String name;
    private String dateOfExpire;

    public CreditCardStrategy(String cardNumber, String cvv, String name, String dateOfExpire) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.name = name;
        this.dateOfExpire = dateOfExpire;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + ": payment by creadit card");
    }
}
