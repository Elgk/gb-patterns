package ru.geekbrains.gbpatterns.systemic.registry;

public class Registry {
    private static Registry instance = new Registry();

    protected PersonFinder personFinder = new PersonFinder();

    public static Registry getInstance(){
        return instance;
    }
    public PersonFinder getPersonFinder(){
        return personFinder;
    }

}
