package com.example.wstest.dao;

import com.example.wstest.dao.basedao.BaseRepository;
import com.example.wstest.model.Classify;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClassifyRepository extends BaseRepository<Classify,Integer>, JpaSpecificationExecutor<Classify> {
}
