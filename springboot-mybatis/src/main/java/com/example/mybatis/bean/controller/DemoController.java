package com.example.mybatis.bean.controller;

import com.example.mybatis.bean.User;
import com.example.mybatis.bean.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        List<User> userList = userMapper.getUserList();
        userList.forEach(list -> {
            System.out.println(list);
        });
        return userList;
    }
}
