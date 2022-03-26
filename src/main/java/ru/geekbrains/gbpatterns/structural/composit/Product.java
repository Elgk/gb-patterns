package ru.geekbrains.gbpatterns.structural.composit;

import java.util.List;

public class Product implements Item{

    private final int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public List<Item> getListItem() {
        return null;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void add(Item item){
    }

    public void add(Item... items){}

    public void remove(Item item){
    }
}
