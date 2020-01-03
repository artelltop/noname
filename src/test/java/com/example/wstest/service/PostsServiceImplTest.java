package com.example.wstest.service;

import com.example.wstest.dao.PostsRepository;
import com.example.wstest.model.Posts;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostsServiceImplTest {
    @Autowired
    private PostsService postsService;
    @Autowired
    private PostsRepository postsRepository;
    @Test
    void add() {
        Posts posts = new Posts();
        posts.setCid(4);
        posts.setContent("wd113312");
        posts.setOid(4);
        posts.setUid(2);
        posts.setTime(new Date());
        postsService.add(posts);
    }

    @Test
    void delete() {
        postsService.delete(2);
    }

    @Test
    void update() {
    }

    @Test
    void list() {
    }
}