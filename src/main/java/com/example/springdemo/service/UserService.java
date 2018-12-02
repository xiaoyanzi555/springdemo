package com.example.springdemo.service;

import com.example.springdemo.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
