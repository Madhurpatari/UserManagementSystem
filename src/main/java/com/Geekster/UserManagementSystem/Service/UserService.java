package com.Geekster.UserManagementSystem.Service;

import com.Geekster.UserManagementSystem.Repository.UserDao;
import com.Geekster.UserManagementSystem.models.User;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;


    public List<User> getAllUser() {
        return userDao.findAll();
    }

    public User getUserById(Integer userId) {
        return userDao.findById(userId).orElseThrow(()-> new EntityNotFoundException("id not found"));

    }

    public User  addUser(User user) {
        return userDao.save(user);
    }

}
