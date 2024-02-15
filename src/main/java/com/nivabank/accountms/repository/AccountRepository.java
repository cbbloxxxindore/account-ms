package com.nivabank.accountms.repository;

import com.nivabank.accountms.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account,String> {
}
