package com.example.wstest.controller;


import com.example.wstest.dao.PostsRepository;
import com.example.wstest.dao.UsersRepository;
import com.example.wstest.model.Posts;
import com.example.wstest.model.Users;
import com.example.wstest.model.classs.PU;
import com.example.wstest.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private PostsService postsService;

    @Autowired
    private PostsRepository postsRepository;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/list")
    public List list(){
        List list = new ArrayList();
        List list1 = postsService.list();
        for(Object a : list1) {

            list.add(a);
            list.add("alskskhajks");
        }
        return list;
    }

    @GetMapping("/list2")
    public PU asd(){
        List<PU> list3 = null;
        List<Posts> list = postsService.list();
        /*for (Posts i:list){
            Users users = usersRepository.findByUid(i.getUid());
            if (users == null) continue;
            PU pu = new PU(users.getNickname(),users.isAuthentication(),i.getUid(),i.getPid(),i.getTime(),i.getOid(),i.getCid(),i.getContent());
            PU pu = new PU("小苏打",true,1,1,new Date(),1,1,"哈哈哈哈");
            list3.add(pu);
            System.out.println(i.getUid()+i.getContent());
        }*/
        //PU pu = new PU("小苏打",true,1,1,new Date(),1,1,"哈哈哈哈");
        PU pu = null;
        pu.setNickname("dedaw");
        //list3.add(pu);
        return pu;
    }


    @GetMapping("/list3")
    public Users asd3(){
        List<PU> list3 = null;
        List<Posts> list1 = postsService.list();
        Users users = usersRepository.findByUid(5);

        return users;
    }
}
