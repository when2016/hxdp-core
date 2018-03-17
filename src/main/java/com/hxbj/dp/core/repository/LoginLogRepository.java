package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.LoginLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/1/15
 */
@Repository
public interface LoginLogRepository extends MongoRepository<LoginLog, String> {

  Page<LoginLog> findByLoginNameLikeOrNameLike(String loginName, String name, Pageable pageable);
}
