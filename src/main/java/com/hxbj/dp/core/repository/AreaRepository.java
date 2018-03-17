package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.Area;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/1/22
 */
@Repository
public interface AreaRepository extends MongoRepository<Area, String> {

  Page<Area> findByParentId(String areaId, Pageable pageable);

  List<Area> findByNameLike(String name);
}
