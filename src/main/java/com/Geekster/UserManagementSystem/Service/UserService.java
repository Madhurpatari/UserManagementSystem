package com.Geekster.UserManagementSystem.Service;

import com.Geekster.UserManagementSystem.Repository.UserDao;
import com.Geekster.UserManagementSystem.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;


    public List<User> getAllUser() {
        return userDao.getUser();
    }

    public User getUserById(String userId) {
        List<User> listRightNow =  UserDao.getUsersFromDataSource();
        for(User user :listRightNow)
        {
            if(user.getUserId().equals(userId))
            {
                return user;// multiple IDs may exist
            }
        }

        return null;

    }

    public String  addUser(User user) {
        boolean status =  userDao.save(user);
        if(status){
            return "User added Successfully";
        }else{
            return "Failed to addUser.. DataBase Error..!! ";
        }
    }

    public String updateUserById(String userId, String newName) {
        boolean updateStatus =  userDao.update(userId,  Boolean.parseBoolean(newName));
        if(updateStatus){
            return "user with Id : " + userId + " was updated";
        }else{
            return "user with Id : " + userId + " not found";
        }
    }

    public String deleteUser(String userId) {
        boolean deleteResponse = false;
        String status;
        if(userId != null)
        {
            List<User> listRightNow =  UserDao.getUsersFromDataSource();

            for(User user : listRightNow)
            {
                if(user.getUserId().equals(userId))
                {
                    deleteResponse = userDao.remove(user);
                    if(deleteResponse)
                    {
                        status = "User with id: " + userId + " was deleted!!!";
                    }
                    else
                    {
                        status = "User with id: " + userId + " was not deleted!!!...Database error";
                    }
                    return status;
                }
            }

            return "User with id: " + userId + " does not exist!!!";
        }
        else
        {
            return "Invalid Id ....Cannot accept Null ID!!";
        }
    }
}
