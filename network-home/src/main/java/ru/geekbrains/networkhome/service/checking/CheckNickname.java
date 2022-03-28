package ru.geekbrains.networkhome.service.checking;

import org.springframework.stereotype.Component;
import ru.geekbrains.networkhome.exception.NotUniqueDataException;
import ru.geekbrains.networkhome.model.User;
import ru.geekbrains.networkhome.model.UserRepository;

@Component
public class CheckNickname extends UserDataChecking {

    private UserRepository userRepository;

    public CheckNickname( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void check(User user) {
        if (userRepository.findByNickname(user.getNickname()).isPresent()) {
            throw new NotUniqueDataException("Ползователь " + user.getNickname() + " уже существует");
        }
    }

}
