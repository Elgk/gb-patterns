package ru.geekbrains.gbpatterns.behavoiral.state.exsample;

public class StartState implements TvState {
    @Override
    public void doAction() {
        System.out.println("TV is ON");
    }
}
