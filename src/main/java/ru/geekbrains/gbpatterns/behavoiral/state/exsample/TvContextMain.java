package ru.geekbrains.gbpatterns.behavoiral.state.exsample;

public class TvContextMain {
    public static void main(String[] args) {
        TvContext tvContext = new TvContext();
        TvState tvStart = new StartState();
        TvState tvStop = new StopState();

        tvContext.setState(tvStart);
        tvContext.doAction();

        tvContext.setState(tvStop);
        tvContext.doAction();
    }
}
