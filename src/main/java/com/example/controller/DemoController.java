package com.example.controller;

import com.example.bean.User;
import com.example.jdbc.service.UserService;
import com.example.jdbc.utils.UserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class DemoController {

    private final UserService userService;

    public DemoController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/hello")
    public List<User> demo(){
        System.out.println(LocalDateTime.now()+"   ======");
        User user = new User();
        user.setName(UserUtils.getName());
        user.setAge(String.valueOf(UserUtils.getAge()));
        user.setId(String.valueOf(System.currentTimeMillis()));
        System.out.println(user.toString());
        userService.addUser(user);

        List<User> allUser = userService.getAllUser();
        return allUser;
    }
}
