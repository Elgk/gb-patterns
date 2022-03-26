package ru.geekbrains.gbpatterns.generative.factory;

public interface DocProvider {
    Doc getDoc(int id);
    void sentPayment(Payment payment);
}
