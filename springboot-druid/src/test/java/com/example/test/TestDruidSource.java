package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
public class TestDruidSource {

    @Autowired
    DataSource dataSource;

    @Test
    public  void testConnection(){
        System.out.println(dataSource.getClass());
    }
}
