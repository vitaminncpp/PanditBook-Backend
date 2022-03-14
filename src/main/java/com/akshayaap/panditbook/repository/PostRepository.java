package com.akshayaap.panditbook.repository;

import com.akshayaap.panditbook.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
