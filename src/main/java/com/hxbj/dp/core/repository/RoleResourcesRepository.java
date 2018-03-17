package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.RoleResources;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/2/4
 */
@Repository
public interface RoleResourcesRepository extends MongoRepository<RoleResources, String> {

  List<RoleResources> getAllByRoleId(String roleId);
}
