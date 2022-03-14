package com.akshayaap.panditbook.controller;


import com.akshayaap.panditbook.model.Post;
import com.akshayaap.panditbook.model.User;
import com.akshayaap.panditbook.repository.PostRepository;
import com.akshayaap.panditbook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @Autowired
    PostService service;

    @Autowired
    PostRepository repository;

    @PostMapping("/post")
    @ResponseBody
    public Post post(@RequestBody Post post, @RequestParam User user) {
        return service.post(post,user);
    }



}