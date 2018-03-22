package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.Race;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/1/29
 */
@Repository
public interface RaceRepository extends MongoRepository<Race, String> {

  Page<Race> findByNameLike(String name, Pageable pageable);

  Page<Race> findByEventId(String eventId, Pageable pageable);

  Page<Race> findByScheduleId(String scheduleId, Pageable pageable);

  Page<Race> findByNameLikeAndEventId(String name, String eventId, Pageable pageable);

  Page<Race> findByNameLikeAndScheduleId(String name, String scheduleId, Pageable pageable);

  List<Race> findByNameLike(String name);

  List<Race> findByScheduleIdOrderByOrderIdAsc(String scheduleId);
}
