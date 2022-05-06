package ru.geekbrains.networkhome.mapping_util;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class MapperRegistry {

    private static MapperRegistry instance = new MapperRegistry();

    private MapperRegistry(){}

    public static MapperRegistry getInstance() {
        return instance;
    }

    private final static Map<Class<? extends DomainObj>, DomainObjMapper<? extends DomainObj> > mappers  = new HashMap<>();

    public DomainObjMapper<DomainObj> getMapper(Class<? extends DomainObj> aClass){
        return (DomainObjMapper<DomainObj>) mappers.get(aClass);
    }

    public  void add(Class<? extends DomainObj> aClass, DomainObjMapper<? extends DomainObj> mapper){
       mappers.put(aClass, mapper);
    }

}
