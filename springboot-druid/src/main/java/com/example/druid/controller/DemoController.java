package com.example.druid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DemoController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    public void getList(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user ");

        maps.forEach(map ->{
            System.out.println(map);
        });
    }

}
