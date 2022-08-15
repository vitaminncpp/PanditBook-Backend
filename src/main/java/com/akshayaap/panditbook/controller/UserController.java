package com.akshayaap.panditbook.controller;

import com.akshayaap.panditbook.model.Search;
import com.akshayaap.panditbook.model.User;
import com.akshayaap.panditbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService service;


    @PostMapping("/register")
    @ResponseBody
    public User register(@RequestBody User user) {
        System.out.println(user);
        return service.insert(user);
    }

    @PostMapping("/allusers")
    @ResponseBody
    public List<User> findAll() {
        return service.findAll();
    }

    @PostMapping("/findallpandits")
    @ResponseBody
    public Map<String, Object> findPandits(@RequestBody Search search) {
        return service.findPandits(search);
    }

    @GetMapping("/find")
    @ResponseBody
    public Map<String, Object> getUserPage(@RequestBody Search search) {
        return service.getUserPage(search);
    }


    @PostMapping("/login")
    @ResponseBody
    public User login(@RequestBody User login) {
        User user=service.login(login);
        System.out.println(user);
        return user;
    }



    @PostMapping("/update")
    @ResponseBody
    public User update(@RequestBody User user) {
        return service.update(user);
    }

    @PostMapping("/delete")
    @ResponseBody
    public String delete(@RequestBody User user) {
        return service.delete(user);
    }

}
