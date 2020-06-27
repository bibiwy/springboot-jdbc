package com.example.jdbc.dao.impl;

import com.example.bean.User;
import com.example.jdbc.dao.UserDao;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    public final DataSource dataSource;

    public UserDaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void addUser(User user)  {
        String sql ="insert into user (id, name, age) VALUES (?,?,?)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = dataSource.getConnection();
            ps = connection.prepareStatement(sql);
            System.out.println(user.toString());
            ps.setString(1,user.getId());
            ps.setString(2,user.getName());
            ps.setString(3,user.getAge());
            boolean execute = ps.execute();
            System.out.println("插入=  "+execute);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(null != connection){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(null != ps){
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }


    }

    public List<User> getAllUser(){
        String sql ="select * from ssm.user ";
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<User> list = new ArrayList<>();
        try {
            connection = dataSource.getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            User user = null;
            while (rs.next()){
                user = new User();
                user.setId(rs.getString("id"));
                user.setAge(rs.getString("age"));
                user.setName(rs.getString("name"));
                list.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(null != connection){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(null != ps){
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return  list;
    }
}
