package com.ulipese.solid.services;

import com.ulipese.solid.entities.User;
import com.ulipese.solid.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
