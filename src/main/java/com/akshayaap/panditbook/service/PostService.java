package com.akshayaap.panditbook.service;


import com.akshayaap.panditbook.model.Post;
import com.akshayaap.panditbook.model.User;
import com.akshayaap.panditbook.repository.PostRepository;
import com.akshayaap.panditbook.repository.UserRepository;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class PostService {

    @Autowired
    PostRepository repository;

    @Autowired
    UserRepository userRepository;


    public Post post(@NotNull User user, @NotNull Post post) {

        if (!post.getUid().equals(user.getId())) {
            //TODO Send error message that user is not associated with post
            return new Post();

        }

        User user1;
        try {
            user1 = userRepository.findOneByEmail(user.getEmail(), user.getpHash()).get();
        } catch (NoSuchElementException ex) {
            return new Post();
        }
        if (user1.getId().equals(user.getId()) && user1.getpHash().equals(user.getpHash())) {
            try {
                return repository.insert(post);
            } catch (Exception e) {
                //TODO Post might already exist
                //TODO Problem with post content
                return new Post();
            }

        } else {
            // TODO User is not Registered
            return new Post();
        }
    }


    public Post getPost(@NotNull User user, @NotNull String id) {
        // Get single Post for user
        User user1;
        try {
            user1 = userRepository.findOneByEmail(user.getEmail(), user.getpHash()).get();
        } catch (NoSuchElementException ex) {
            return new Post();
        }

        try {
            return repository.findById(new ObjectId(id)).get();
        } catch (NoSuchElementException exception) {
            //TODO Post might not exist
            return new Post();
        }
    }

    public Post updatePost(@NotNull User user, @NotNull Post post) {

        if (!post.getUid().equals(user.getId())) {
            //TODO User is not associated with post
            return new Post();
        }
        User user1;
        try {
            user1 = userRepository.findOneByEmail(user.getEmail(), user.getpHash()).get();
        } catch (NoSuchElementException ex) {
            return new Post();
        }
        if (user1.getId().equals(user.getId()) && user1.getpHash().equals(user.getpHash())) {
            try {
                return repository.save(post);
            } catch (Exception e) {
                //TODO Post might not exist
                return new Post();
            }
        }
        //TODO User is Not Registered
        return new Post();

    }

    public String deletePost(@NotNull User user, @NotNull Post post) {
        if (!post.getUid().equals(user.getId())) {
            //TODO User is not associated with post
            return "User is not associated with post";
        }
        User user1;
        try {
            user1 = userRepository.findOneByEmail(user.getEmail(), user.getpHash()).get();
        } catch (NoSuchElementException ex) {
            //TODO User is not registered
            return "User not allowed to delete post";
        }
        if (user1.getId().equals(user.getId()) && user1.getpHash().equals(user.getpHash())) {
            repository.delete(post);
            //TODO Post deleted
            return "Post Deleted";
        }
        //TODO User is not registered
        return "User not allowed to delete post";
    }


}
