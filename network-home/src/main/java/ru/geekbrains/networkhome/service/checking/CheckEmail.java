package ru.geekbrains.networkhome.service.checking;

import org.springframework.stereotype.Component;
import ru.geekbrains.networkhome.exception.NotUniqueDataException;
import ru.geekbrains.networkhome.model.User;
import ru.geekbrains.networkhome.model.UserRepository;

@Component
public class CheckEmail extends UserDataChecking {

    private UserRepository userRepository;

    public CheckEmail( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void check(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new NotUniqueDataException("Ползователь с email" + user.getEmail() + " уже существует");
        }
        else {
            if (next != null){
                next.check(user);
            }
        }
    }

}
