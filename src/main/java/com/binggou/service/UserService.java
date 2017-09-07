package com.binggou.service;

import com.binggou.dao.UserMapper;
import com.binggou.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BingGou on 2017-09-07.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAll(){
        return userMapper.getAll();
    }

    public void insertUser(User user){
        userMapper.insert(user);
    }
}
