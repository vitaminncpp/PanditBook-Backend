package com.akshayaap.panditbook.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.akshayaap.panditbook.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    @Query(value = "{'_id':?0,'pHash':?1}")
    Optional<User> findOne(String _id, String pHash);

    @Query("{email:?0,pHash:?1}")
    Optional<User> findOneByEmail(String email, String pHash);
}
