package ru.geekbrains.networkhome.service;


import org.springframework.stereotype.Service;
import ru.geekbrains.networkhome.model.User;
import ru.geekbrains.networkhome.model.UserRepository;
import ru.geekbrains.networkhome.service.checking.CheckEmail;
import ru.geekbrains.networkhome.service.checking.CheckLogin;
import ru.geekbrains.networkhome.service.checking.CheckNickname;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CheckLogin checkLogin;
    private final CheckEmail checkEmail;
    private final CheckNickname checkNickname;

    public UserService(UserRepository userRepository, CheckLogin checkLogin, CheckEmail checkEmail, CheckNickname checkNickname) {
        this.userRepository = userRepository;
        this.checkLogin = checkLogin;
        this.checkEmail = checkEmail;
        this.checkNickname = checkNickname;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public List<User> findByLastName(String name) {
        return userRepository.findByLastName(name);
    }

    public User save(User user){
       checkLogin.setNext(checkEmail);
       checkEmail.setNext(checkNickname);
       checkLogin.check(user);
       User.Builder builder = User.builder()
               .login(user.getLogin())
               .password(user.getPassword())
               .nickname(user.getNickname());
       return userRepository.save(builder.build());
    }
}
