package ru.geekbrains.networkhome.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.networkhome.exception.NotFoundException;
import ru.geekbrains.networkhome.model.User;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ProxyUserService implements FindUsers {
    private final UserService userService;

    private List<User> users = new CopyOnWriteArrayList<>();
    private Map<String, List<User>> usersByName = new ConcurrentHashMap<>();

    public ProxyUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<User> findByLastName(String name) {
        usersByName.compute(name, (k,v) ->{
            if (v == null){
                List<User> list = userService.findByLastName(name);
                if (!list.isEmpty()){
                    usersByName.put(k, list);
                    return list;
                }else {
                    throw new NotFoundException("Users with last name " + name + " not found");
                }
            }else {
                return v;
            }
        });
        return null;
    }

    @Override
    public List<User> findAll() {
        if (users.isEmpty()){
            users.addAll(userService.findAll());
            return userService.findAll();
        }else {
            return users;
        }

    }
}
