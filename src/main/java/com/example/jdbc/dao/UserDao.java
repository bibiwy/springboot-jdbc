package com.example.jdbc.dao;

import com.example.bean.User;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {

     void addUser(User user);
     List<User> getAllUser();

}
