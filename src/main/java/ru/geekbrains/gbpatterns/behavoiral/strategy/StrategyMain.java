package ru.geekbrains.gbpatterns.behavoiral.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Item item1 = new Item("111", 23);
        Item item2 = new Item("222", 405);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new CreditCardStrategy("121212","898","Bob","10/23"));
        cart.pay(new PayPalStrategy("sss,rrr@fdjfh.com", "*****"));
    }
}
