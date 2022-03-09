package ru.geekbrains.networkhome.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.networkhome.model.User;
import ru.geekbrains.networkhome.model.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public String save(@RequestBody User user){
        userService.save(user);
        return "redirect:/user";
    }
}
