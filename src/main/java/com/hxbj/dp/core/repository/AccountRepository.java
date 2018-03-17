package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/2/3
 */
@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

  Page<Account> findByNameLike(String name, Pageable pageable);

  int countByLoginName(String loginName);

  Account findAccountByLoginName(String loginName);
}
