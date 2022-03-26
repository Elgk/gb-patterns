package ru.geekbrains.gbpatterns.behavoiral.observer;


import java.util.List;

public interface NewsChannel {
    void subscribe(Reader reader);
    void unsubscribe(Reader reader);

    void notifyAllReaders(NewsChannel newsChannel);

    List<News> getNews();
}
