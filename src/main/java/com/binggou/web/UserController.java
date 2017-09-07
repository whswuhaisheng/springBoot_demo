package com.binggou.web;

import com.binggou.entity.User;
import com.binggou.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;



@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getAll")
    public List<User> getAll(){
        List<User> all = userService.getAll();
        System.out.println(all);
        return all;
    }
    @RequestMapping("/addUser")
    public String  addUser(){
        userService.insertUser(new User());
        return "success";
    }
}
