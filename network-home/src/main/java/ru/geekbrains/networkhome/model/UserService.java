package ru.geekbrains.networkhome.model;


import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User save(User user){
       User.Builder builder = User.builder()
               .login(user.getLogin())
               .password(user.getPassword())
               .nickname(user.getNickname());
       return userRepository.save(builder.build());
    }
}
