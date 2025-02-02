package com.ulipese.solid.controllers;

import com.ulipese.solid.entities.User;
import com.ulipese.solid.interfaces.services.UserServiceInterface;
import com.ulipese.solid.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "User API", description = "Operations for managing users")
public class UserController {
    @Autowired
    UserServiceInterface userServiceInterface;

    @GetMapping
    @Operation(
            summary = "Get all users",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Successfully retrieved users")
            }
    )
    public List<User> getUsers() {
        return userServiceInterface.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        return userServiceInterface.getUserById(userId);
    }

    @PostMapping
    @Operation(summary = "Create a new user")
    public User createUser(@RequestBody User user) {
        return userServiceInterface.saveUser(user);
    }

    @PutMapping("/{userId}")
    public void updateUser(@PathVariable String userId, @RequestBody User user) {
        userServiceInterface.updateUser(userId, user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") String userId) {
        userServiceInterface.deleteUser(userId);
    }
}
