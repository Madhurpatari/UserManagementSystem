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
    @PostMapping("/")
    public String addUser(@Valid @RequestBody User user) {
        return userService.addUser(user);
    }
    @GetMapping(value = "/")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @PutMapping(value = "/{userId}/{newName}")
    public String updateUserById(@PathVariable String userId, @PathVariable String newName){
        return userService.updateUserById(userId, newName);

    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return userService.deleteUser(userId);
    }


}

