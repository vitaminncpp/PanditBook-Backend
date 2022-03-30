package com.akshayaap.panditbook.repository;

import com.akshayaap.panditbook.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PostRepository extends MongoRepository<Post,String> {
    @Query(value = "{'_id':?0}")
    public Post findOne(String id);
}
