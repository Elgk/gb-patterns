package ru.geekbrains.gbpatterns.composit;

import java.util.List;

public interface Item {
    List<Item> getListItem();

    int getPrice();

    void add(Item item);

    void add(Item... items);// ... может быть передано 0, один или более параметров или массив; всегда располагается в конце списка параметров

    void remove(Item item);
}
