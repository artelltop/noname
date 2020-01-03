package com.example.wstest.controller;



import com.example.wstest.model.Posts;
import com.example.wstest.model.Users;
import com.example.wstest.model.classs.PU;
import com.example.wstest.service.PostsService;
import com.example.wstest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private PostsService postsService;

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List list(){
        List<PU> list3 = new ArrayList<>();
        List<Posts> list = postsService.list();
        for (Posts i:list){
            Users users = userService.findByUid(i.getUid());
            if (users == null) continue;
            PU pu = new PU();
            pu.setNickname(users.getNickname());
            pu.setAuthentication(users.isAuthentication());
            pu.setUid(i.getUid());
            pu.setPid(i.getPid());
            pu.setTime(i.getTime());
            pu.setOid(i.getOid());
            pu.setCid(i.getCid());
            pu.setContent(i.getContent());
            list3.add(pu);
        }
        return list3;
    }

    @PostMapping("/add")
    private void add(Posts posts){
        posts.setTime(new Date());
        postsService.add(posts);
    };

    @PostMapping("/delete")
    private void delete(int pid){
        postsService.delete(pid);
    }

    //获取原本内容
    @GetMapping("{pid}/update")
    private String update(@PathVariable int pid){
        String s = postsService.findbypid(pid).getContent();
        return s;
    };
    //修改保存
    @PostMapping("{pid}/update")
    private void update(@PathVariable int pid, String content){
        postsService.update(pid,content);
    };


}
