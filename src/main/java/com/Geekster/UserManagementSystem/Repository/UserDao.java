package com.Geekster.UserManagementSystem.Repository;

import com.Geekster.UserManagementSystem.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
 public interface UserDao extends JpaRepository<User, Integer> {
}
