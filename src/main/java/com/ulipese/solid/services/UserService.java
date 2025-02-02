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
        try {
            return userRepository.findAll();
        } catch (Exception err) {
            System.err.println(err.getMessage());
            return null;
        }
    }

    public User getUserById(String id) {
        try {
            return userRepository.findById(id);
        } catch (Exception err) {
            System.err.println(err.getMessage());
            return null;
        }
    }

    public User saveUser(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception err) {
            System.err.println(err.getMessage());
            return null;
        }
    }

    public void updateUser(String userId, User user) {
        try {
            if (userRepository.findById(userId) != null) {
                userRepository.updateById(userId, user.getName(), user.getAge());
            }
        } catch (Exception err) {
            System.err.println(err.getMessage());
        }
    }

    public void deleteUser(int userId) {
        try {
            userRepository.deleteById(userId);
        } catch (Exception err) {
            System.err.println(err.getMessage());
        }
    }
}
