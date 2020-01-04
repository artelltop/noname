package com.example.wstest.dao;

import com.example.wstest.dao.basedao.BaseRepository;
import com.example.wstest.model.Comment;
import com.example.wstest.model.Posts;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface CommentRepository extends BaseRepository<Comment,Integer>, JpaSpecificationExecutor<Comment> {
    public Comment findByComid(int comid);

    public List<Comment> findAllByPid(int pid);
}
