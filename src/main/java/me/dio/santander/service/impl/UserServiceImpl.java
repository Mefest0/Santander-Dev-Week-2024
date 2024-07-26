package me.dio.santander.service.impl;

import me.dio.santander.domain.model.User;
import me.dio.santander.domain.repository.UserRepository;
import me.dio.santander.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("Este usuario ID atualmente ja existe");
        }
        return userRepository.save(userToCreate);
    }
}
