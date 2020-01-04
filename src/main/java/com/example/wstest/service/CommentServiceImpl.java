package com.example.wstest.service;

import com.example.wstest.dao.CommentRepository;
import com.example.wstest.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;


    @Override
    public void add(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void delete(int comid) {
        commentRepository.delete(commentRepository.findByComid(comid));
    }

    @Override
    public Comment update(Comment comment) {
        return null;
    }

    @Override
    public List<Comment> list(int pid) {
        return commentRepository.findAllByPid(pid);
    }

    @Override
    public Comment findByComid(int comid) {
        return commentRepository.findByComid(comid);
    }
}
