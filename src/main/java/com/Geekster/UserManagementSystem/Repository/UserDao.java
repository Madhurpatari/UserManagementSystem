package com.Geekster.UserManagementSystem.Repository;

import com.Geekster.UserManagementSystem.models.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class UserDao {

    private static  List<User> arrayList;
    public UserDao(){
        System.out.println("Dummy user created");
        arrayList = new ArrayList<>();
        arrayList.add(new User("0", "Madhur","01-09-1997", "kmadhur07@gmail.com"
        , "8975623147", "25-04-2023" , "15:13"));
    }

    public static List<User> getUsersFromDataSource() {
        return arrayList;
    }


    public List<User> getUser() {
        return arrayList;
    }

    public boolean save(User user) {
        arrayList.add(user);
        return true;
    }

    public boolean update(String userId, boolean newName) {
        boolean updateStatus = false;
        for(User user : arrayList){
            if(user.getUserId().equals(userId)){
                remove(user);
                user.setUserName(String.valueOf(newName));
                save(user);
                return  true;
            }
        }
        return false;
    }

    public boolean remove(User user){
        arrayList.remove(user);
        return true;
    }
}
