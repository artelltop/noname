package com.example.wstest.service;

import com.example.wstest.model.Posts;

import java.util.List;

public interface PostsService {

    //新建帖子
    public void add(Posts posts);

    //删帖
    public void delete(int id);

    //更新帖子
    public Posts update(Posts posts);

    //帖子列表
    public List<Posts> list();

}
