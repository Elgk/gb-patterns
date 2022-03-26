package ru.geekbrains.gbpatterns.generative.factory;

public class Fabric {

    public ExchangeFactory createFactory(String name){
        switch (name){
            case "CITILINK":
                return  new CitilinkExchangeFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        Fabric fabric = new Fabric();
        ExchangeFactory citilink = fabric.createFactory("CITILINK");
        citilink.createPriceProvider().getPrice("asd");
    }
}
