package com.example.springdemo.dao;


import com.example.springdemo.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserDao {
    List<User> findAll();
}
