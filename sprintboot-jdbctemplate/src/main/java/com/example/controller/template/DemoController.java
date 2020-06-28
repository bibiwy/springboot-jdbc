package com.example.controller.template;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class DemoController {

    @Resource
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/tempJdbc")
    public  void tempJdbc(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from ssm.user limit 10");
        maps.forEach(map ->{
            System.out.println(map);
        });
        System.out.println(LocalDateTime.now()+"  =====");
    }
}
