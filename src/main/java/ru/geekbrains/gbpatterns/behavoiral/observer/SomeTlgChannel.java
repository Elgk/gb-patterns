package ru.geekbrains.gbpatterns.behavoiral.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SomeTlgChannel implements NewsChannel {

    private Set<Reader> readers = new HashSet<>();

    @Override
    public void subscribe(Reader reader) {
        readers.add(reader);
    }

    @Override
    public void unsubscribe(Reader reader) {
        readers.remove(reader);
    }

    @Override
    public void notifyAllReaders(NewsChannel newsChannel) {
        readers.forEach(reader -> reader.notifyAboutNews(this));
    }

    @Override
    public List<News> getNews() {
        return null;
    }
}
