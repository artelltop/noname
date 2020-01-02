package com.example.wstest.dao;

import com.example.wstest.dao.basedao.BaseRepository;
import com.example.wstest.model.Comment;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommentRepository extends BaseRepository<Comment,Integer>, JpaSpecificationExecutor<Comment> {
}
