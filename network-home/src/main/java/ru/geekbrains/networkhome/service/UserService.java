package ru.geekbrains.networkhome.service;


import org.springframework.stereotype.Service;
import ru.geekbrains.networkhome.exception.NotFoundException;
import ru.geekbrains.networkhome.model.User;
import ru.geekbrains.networkhome.model.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public List<User> findByLastName(String name) {
        return userRepository.findByLastName(name);
    }

    public User save(User user){
       User.Builder builder = User.builder()
               .login(user.getLogin())
               .password(user.getPassword())
               .nickname(user.getNickname());
       return userRepository.save(builder.build());
    }
}
