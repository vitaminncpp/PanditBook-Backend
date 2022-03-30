package com.akshayaap.panditbook.controller;


import com.akshayaap.panditbook.model.Post;
import com.akshayaap.panditbook.model.PostRequest;
import com.akshayaap.panditbook.model.User;
import com.akshayaap.panditbook.repository.PostRepository;
import com.akshayaap.panditbook.service.PostService;
import org.jetbrains.annotations.NotNull;
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
    public Post post(@RequestBody @NotNull PostRequest request) {
        return service.post(request.getUser(),request.getPost());
    }


    @PostMapping("/getpost")
    @ResponseBody
    public Post getPost(@RequestBody @NotNull PostRequest request) {
        return service.getPost(request.getUser(),request.getPost().getId());
    }

    @PostMapping("/post/edit/")
    @ResponseBody
    public Post updatePost(@RequestBody @NotNull PostRequest request) {
        return service.updatePost(request.getUser(),request.getPost());
    }

    @PostMapping("/post/delete/")
    @ResponseBody
    public String deletePost(@RequestBody @NotNull PostRequest request) {
        return service.deletePost(request.getUser(),request.getPost());
    }


}