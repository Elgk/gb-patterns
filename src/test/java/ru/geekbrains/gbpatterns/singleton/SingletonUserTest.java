package ru.geekbrains.gbpatterns.singleton;

import org.junit.jupiter.api.Test;
import ru.geekbrains.gbpatterns.generative.singleton.Mashine;
import ru.geekbrains.gbpatterns.generative.singleton.SingletonUser;

class SingletonUserTest {

    // одиночка - антипаттерн, т.к. при тестировании этот объект нельзя подменить, т.е. тестирование будет обращаться
    // в продуктивную среду и влиять на данные
    // решение: для приложений spring в кофигурации указывают scope - брать одиночку из контекста
    @Test
    public void test(){
        SingletonUser singletonUser = new SingletonUser();
        singletonUser.work();
    }

    // паттерн prototype
    @Test
    public void testClone() throws CloneNotSupportedException {
//
//        Mashine mashine = new Mashine();
//        mashine.clone();
    }

}