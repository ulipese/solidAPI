package com.ulipese.solid.services;

import com.ulipese.solid.entities.User;
import com.ulipese.solid.interfaces.services.UserServiceInterface;
import com.ulipese.solid.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void updateUser(String userId, User user) {
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}