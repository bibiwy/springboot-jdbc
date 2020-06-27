package com.example.jdbc.service;

import com.example.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

     void addUser(User user);

     List<User> getAllUser();
}
