package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.OperationLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/3/2
 */
@Repository
public interface OperationLogRepository extends MongoRepository<OperationLog, String> {

  Page<OperationLog> findByLoginNameLikeOrNameLike(String loginName, String name,
      Pageable pageable);

}
