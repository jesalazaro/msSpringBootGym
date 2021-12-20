package com.gimnasio.AccountMS.repositories;
import  com.gimnasio.AccountMS.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {

}
