package com.example.wstest.dao;

import com.example.wstest.dao.basedao.BaseRepository;
import com.example.wstest.model.Users;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends BaseRepository<Users,Integer>, JpaSpecificationExecutor<Users> {

    public Users findByUid(int uid);

    public Users findByPhone(String phone);
}
