package com.akshayaap.panditbook.repository;

import com.akshayaap.panditbook.model.Post;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    @Query(value = "{_id:?0}")
    public Optional<Post> findOne(@Param("_id") String id);

    @Query(value = "{_id:?0}")
    public @NotNull Optional<Post> findById(@Param("_id") ObjectId id);

}
