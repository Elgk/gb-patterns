package ru.geekbrains.gbpatterns.behavoiral.state.exsample;

public class StopState implements TvState {
    @Override
    public void doAction() {
        System.out.println("TV is OFF");
    }
}
