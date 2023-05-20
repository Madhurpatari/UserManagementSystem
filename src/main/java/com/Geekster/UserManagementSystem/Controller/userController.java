package com.Geekster.UserManagementSystem.Controller;

import com.Geekster.UserManagementSystem.Service.UserService;
import com.Geekster.UserManagementSystem.models.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class userController {
    @Autowired
    UserService userService;
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }
}

