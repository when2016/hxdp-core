package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * wang 2018/2/3
 */
public interface RoleRepository extends MongoRepository<Role, String> {

  Page<Role> findByNameLike(String name, Pageable pageable);

}
