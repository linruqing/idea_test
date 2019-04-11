package com.neusoft.service.impl;

import com.neusoft.mapper.UserMapper;
import com.neusoft.pojo.User;
import com.neusoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.insertUser(user);
    }
}
