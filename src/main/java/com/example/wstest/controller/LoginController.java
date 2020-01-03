package com.example.wstest.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.wstest.model.Users;
import com.example.wstest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@CrossOrigin
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping
    public JSONObject login(String phone, String password, HttpSession session){
        JSONObject jsonObject = new JSONObject();
        Users users = new Users();
        users = userService.login(phone,password);
        if (users != null){
            jsonObject.put("id",users.getUid());
            session.setAttribute("id",users.getUid());
            jsonObject.put("msg","登录成功");
        }else {
            jsonObject.put("msg","登录失败");
        }
        return jsonObject;
    }
}
