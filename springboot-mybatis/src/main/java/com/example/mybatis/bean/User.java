package com.example.mybatis.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    private String id;
    private String name;
    private String age;

}
