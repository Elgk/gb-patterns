package ru.geekbrains.networkhome.controller;

import org.springframework.web.bind.annotation.*;
import ru.geekbrains.networkhome.model.User;
import ru.geekbrains.networkhome.service.ProxyUserService;
import ru.geekbrains.networkhome.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final ProxyUserService proxyUserService;

    public UserController(UserService userService, ProxyUserService proxyUserService){
        this.userService = userService;
        this.proxyUserService = proxyUserService;
    }

    @GetMapping
    public List<User> findAll(){
        return proxyUserService.findAll();
    }

    @GetMapping("/lastname/{lastname}")
    public List<User> findByLastName(@PathVariable("lastname") String lastname){
        return proxyUserService.findByLastName(lastname);
    }

    @PostMapping
    public String save(@RequestBody User user){
        userService.save(user);
        return "redirect:/user";
    }
}
