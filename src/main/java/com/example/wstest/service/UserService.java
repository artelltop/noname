package com.example.wstest.service;

import com.example.wstest.model.Users;

import java.util.List;


public interface UserService {

    //(添加用户)
    public void add(Users users);

    //(删除用户！！！)
    public void delete(int uid);

    //(更新用户信息)
    public Users update(Users users);

    //查询当前用户
    public Users findByUsername(String phone);

    //用户列表
    public List<Users> list();

    //登录
    public Users login(String phone, String password);
}
