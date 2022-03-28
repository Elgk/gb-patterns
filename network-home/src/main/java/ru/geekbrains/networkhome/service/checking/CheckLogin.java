package ru.geekbrains.networkhome.service.checking;

import org.springframework.stereotype.Component;
import ru.geekbrains.networkhome.exception.NotUniqueDataException;
import ru.geekbrains.networkhome.model.User;
import ru.geekbrains.networkhome.model.UserRepository;

@Component
public class CheckLogin extends UserDataChecking {
    private final UserRepository userRepository;

    public CheckLogin( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void check(User user) {
        if (userRepository.findByLogin(user.getLogin()).isPresent()) {
            throw new NotUniqueDataException("Пользователь с логином " + user.getLogin() + "уже существует");
        }else{
            if (next != null){
                next.check(user);
            }
        }
    }

}
