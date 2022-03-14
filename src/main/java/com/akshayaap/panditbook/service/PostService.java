package com.akshayaap.panditbook.service;


import com.akshayaap.panditbook.model.Post;
import com.akshayaap.panditbook.model.User;
import com.akshayaap.panditbook.repository.PostRepository;
import com.akshayaap.panditbook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepository repository;

    @Autowired
    UserRepository userRepository;



    public Post post(Post post, User user) {
        Example<User> example = Example.of(user);
        User user1 ;
        try {
            user1=userRepository.findAll(example).get(0);
            if(user1.getId()==user.getId()) {
                return repository.insert(post);
            }
            else {
                return new Post();
            }
        }
        catch (Exception e) {
            return new Post();
        }

    }
}
