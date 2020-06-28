package com.example.controller;

import com.custom.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public void hello(){
        String s = helloService.sayHello("9999999999999");
        System.out.println(s);
    }
}
