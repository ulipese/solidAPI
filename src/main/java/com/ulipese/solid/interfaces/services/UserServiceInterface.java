package com.ulipese.solid.interfaces.services;

import com.ulipese.solid.entities.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAllUsers();

    User getUserById(String id);

    User saveUser(User user);

    void updateUser(String userId, User user);

    void deleteUser(String userId);
}
