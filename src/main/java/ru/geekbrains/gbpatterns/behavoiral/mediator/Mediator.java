package ru.geekbrains.gbpatterns.behavoiral.mediator;

import java.awt.*;

public interface Mediator {
    void notify(Component sender, String event);
}
