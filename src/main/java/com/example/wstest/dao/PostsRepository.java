package com.example.wstest.dao;

import com.example.wstest.dao.basedao.BaseRepository;
import com.example.wstest.model.Posts;
import com.example.wstest.model.classs.PU;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends BaseRepository<Posts,Integer>, JpaSpecificationExecutor<Posts> {

    //@Query(value="select new com.example.wstest.model.classs.PU(u,p) from users u,posts p where u.uid=p.uid",nativeQuery=true)
    //public List<PU> findByUid();
    // u.nickname,u.authentication,p.uid,p.pid from users u,posts p where u.uid=p.uid",nativeQuery=true



    /*@Query(value="select u from users u,posts p where u.uid=1?",nativeQuery=true)
    public List<String> findNicknameByuid(int uid);*/

    /*@Query(value="select u.authentication from users u,posts p where u.uid=1?",nativeQuery=true)
    public List<String> findAuthenticationByuid(int uid);*/

    public Posts findByPid(int pid);
}
