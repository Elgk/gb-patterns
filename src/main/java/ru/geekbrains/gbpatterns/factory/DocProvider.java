package ru.geekbrains.gbpatterns.factory;

public interface DocProvider {
    Doc getDoc(int id);
    void sentPayment(Payment payment);
}
