package com.example.wstest.service;

import com.example.wstest.dao.PostsRepository;
import com.example.wstest.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsServiceImpl implements PostsService {

    @Autowired
    private PostsRepository PostsRepository;
    @Override

    public void add(Posts posts) {
        PostsRepository.save(posts);
    }

    @Override
    public void delete(int pid) {
        PostsRepository.deleteById(pid);
    }

    @Override
    public void update(int pid,String content) {
        Posts posts = PostsRepository.findByPid(pid);
        posts.setContent(content);
        PostsRepository.save(posts);
    }

    @Override
    public List<Posts> list() {
        return PostsRepository.findAll();

    }

    @Override
    public Posts findbypid(int pid) {
        return PostsRepository.findByPid(pid);
    }
}
