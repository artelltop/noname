package com.example.wstest.controller;


import com.example.wstest.model.Users;
import com.example.wstest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    //用户列表
    @GetMapping("list")
    public List<Users> list(){
        return userService.list();
    }
    //添加用户
    @PostMapping("add")
    public void add(Users users){
        userService.add(users);
    }
    //修改用户
    @PostMapping(value = "{id}/update")
    public void update(@PathVariable("id") int id,Users users){
        userService.add(users);
    }

    //删除用户
    public void delete(@PathVariable("id") int id){
        userService.delete(id);
    }

}
