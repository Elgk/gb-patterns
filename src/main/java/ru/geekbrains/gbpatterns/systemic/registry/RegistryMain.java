package ru.geekbrains.gbpatterns.systemic.registry;

public class RegistryMain {
    public static void main(String[] args) {
        // Registry.getInstance() - глобалльно видимый объект приложения
        // в реальном приложении вместо static переменной необходимо использовать как спринговый контекст
        PersonLombokExsample person = Registry.getInstance().getPersonFinder().find(1);
    }
}
