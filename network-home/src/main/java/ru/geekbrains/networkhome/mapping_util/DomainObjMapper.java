package ru.geekbrains.networkhome.mapping_util;

public interface DomainObjMapper<T extends DomainObj>{
    void insert(T object);
    void update(T objet);
    void delete(T objcet);
}
