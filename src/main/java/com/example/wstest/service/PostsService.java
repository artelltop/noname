package com.example.wstest.service;

import com.example.wstest.model.Posts;

import java.util.List;

public interface PostsService {

    //新建帖子
    public void add(Posts posts);

    //删帖
    public void delete(int pid);

    //编辑帖子
    public void update(int pid,String comment);

    //帖子列表
    public List<Posts> list();

    public Posts findbypid(int pid);

}
