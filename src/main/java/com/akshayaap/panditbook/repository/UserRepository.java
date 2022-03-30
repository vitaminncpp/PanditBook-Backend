package com.akshayaap.panditbook.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.akshayaap.panditbook.model.User;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    @Query(value = "{_id:?0,pHash:?1}")
    Optional<User> findOne(@Param("_id") ObjectId _id,@Param("pHash") String pHash);

    @Query(value = "{email:?0,pHash:?1}")
    Optional<User> findOneByEmail(@Param("email") String email, @Param("pHash") String pHash);
}
