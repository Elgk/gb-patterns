package ru.geekbrains.gbpatterns.systemic.identity_map;

import ru.geekbrains.gbpatterns.systemic.data_mapper.Person;

import java.util.HashMap;
import java.util.Map;

public class IdentityMap {
    private static IdentityMap instance = new IdentityMap();

    private Map<Long, Person> personMap = new HashMap<>();

    public static void add(Person person){
        instance.personMap.put(person.getId(), person);
    }

    public static Person get(Long key){
        return instance.personMap.get(key);
    }
}
