package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/1/25
 */
@Repository
public interface EventRepository extends MongoRepository<Event, String> {

  Page<Event> findByNameLike(String name, Pageable pageable);

  int countByName(String name);

  int countByNameAndIdIsNot(String name, String id);
}
