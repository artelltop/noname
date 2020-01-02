package com.example.wstest.service;

import com.example.wstest.model.Posts;

import java.util.List;

public interface PostsService {

    public void add(Posts posts);

    public void delete(int id);

    public Posts update(Posts posts);

    public List<Posts> list();

}
