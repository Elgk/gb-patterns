package ru.geekbrains.gbpatterns.behavoiral.strategy;

public class Item {
    private String productCode;
    private int price;

    public Item(String productCode, int price) {
        this.productCode = productCode;
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getPrice() {
        return price;
    }
}
