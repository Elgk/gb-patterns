package ru.geekbrains.gbpatterns.structural.composit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box implements Item {

    private List<Item> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void add(Item item){
        items.add(item);
    }

    public void add(Item... items){
        this.items.addAll(Arrays.asList(items));
    }

    public void remove(Item item){
        items.remove(item);
    }

    @Override
    public List<Item> getListItem() {
        return items;
    }

    @Override
    public int getPrice() {
        return getListItem().stream().mapToInt(Item::getPrice).sum();
    }
}
