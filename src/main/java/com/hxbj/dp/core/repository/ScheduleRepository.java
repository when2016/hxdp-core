package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/1/26
 */
@Repository
public interface ScheduleRepository extends MongoRepository<Schedule, String> {

  Page<Schedule> findByNameLike(String name, Pageable pageable);

}
