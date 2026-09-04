package com.example.credit_card.Service;

import com.example.credit_card.Entity.UserEntity;
import com.example.credit_card.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void saveUser(UserEntity user){
        userRepository.save(user);

    }
}
