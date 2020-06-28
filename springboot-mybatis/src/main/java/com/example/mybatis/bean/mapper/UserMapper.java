package com.example.mybatis.bean.mapper;


import com.example.mybatis.bean.User;
import org.apache.ibatis.annotations.Select;


import java.util.List;


public interface UserMapper {
    List<User> getUserList();
}
