package com.example.wstest.dao;

import com.example.wstest.dao.basedao.BaseRepository;
import com.example.wstest.model.Posts;
import com.example.wstest.model.Users;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PostsRepository extends BaseRepository<Posts,Integer>, JpaSpecificationExecutor<Posts> {

    public void deleteByPid(int pid);
}
