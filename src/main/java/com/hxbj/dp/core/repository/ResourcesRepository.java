package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.Resources;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/2/4
 */
@Repository
public interface ResourcesRepository extends MongoRepository<Resources, String> {

  List<Resources> findAllByLayer(Integer layer, Sort sort);

  int countAllByParentId(String parentId);

}
