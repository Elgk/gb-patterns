package ru.geekbrains.gbpatterns.behavoiral.state.exsample;

public class TvContext implements TvState {

    private TvState state;

    public TvState getState() {
        return state;
    }

    public void setState(TvState state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}
