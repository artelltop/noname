package com.example.wstest.service;

import com.example.wstest.model.Comment;

import java.util.List;

public interface CommentService {

    public void add(Comment comment);

    public void delete(int id);

    public Comment update(Comment comment);

    public List<Comment> list();
}
