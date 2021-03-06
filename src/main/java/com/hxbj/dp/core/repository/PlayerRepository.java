package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/1/17
 */
@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {

  Page<Player> findByNameLike(String name, Pageable pageable);

  int countByName(String name);

  int countByNameAndIdIsNot(String name, String id);

}
