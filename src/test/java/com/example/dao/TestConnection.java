package com.example.dao;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.sql.DataSource;




@SpringBootTest
public class TestConnection {

    @Autowired
    DataSource dataSource;

    @Test
    public  void testConnection(){
        System.out.println(dataSource.getClass());
    }
}
