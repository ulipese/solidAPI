package com.ulipese.solid.controllers;

import com.ulipese.solid.entities.User;
import com.ulipese.solid.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        return userService.getUserById(userId);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/{userId}")
    public void updateUser(@PathVariable String userId, @RequestBody User user) {
        userService.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") String userId) {
        userService.deleteUser(Integer.parseInt(userId));
    }
}
