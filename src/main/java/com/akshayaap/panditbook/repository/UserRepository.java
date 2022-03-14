package com.akshayaap.panditbook.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.akshayaap.panditbook.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
