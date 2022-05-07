package ru.geekbrains.networkhome.mapping_util;

public interface DomainObj {
    Long getId();
    void markNew();
    void markDirty();
    void markRemove();
}
