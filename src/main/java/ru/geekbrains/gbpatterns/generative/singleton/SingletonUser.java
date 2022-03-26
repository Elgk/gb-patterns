package ru.geekbrains.gbpatterns.generative.singleton;

public class SingletonUser {
    public void work() {
        final Singleton instance = Singleton.getInstance();
        instance.work();
    }
}
