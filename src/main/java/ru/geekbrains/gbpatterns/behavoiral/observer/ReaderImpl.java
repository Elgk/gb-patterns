package ru.geekbrains.gbpatterns.behavoiral.observer;

import java.util.List;

public class ReaderImpl implements Reader {
    // это PULL modell
    @Override
    public void notifyAboutNews(NewsChannel channel) {
       List<News> news = channel.getNews();
    }
}
