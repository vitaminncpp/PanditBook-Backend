package com.akshayaap.panditbook.service;

import com.akshayaap.panditbook.model.Search;
import com.akshayaap.panditbook.model.User;
import com.akshayaap.panditbook.repository.UserRepository;
import com.akshayaap.panditbook.util.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User insert(User user) {
        return repository.insert(user);
    }


    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(id).get();
    }

    public Map<String, Object> getUserPage(Search search) {

        HashMap<String, Object> response = new HashMap<>();
        Sort sort = Sort.by(search.getSortBy(), search.getSortOrder());
        Pageable page = (Pageable) PageRequest.of(search.getPageno(), search.getPageSize(), sort);
        Page<User> userPage = repository.findAll(page);
        response.put("data", userPage.getContent());
        response.put("total", userPage.getTotalElements());
        response.put("pages", userPage.getTotalPages());
        response.put("current", userPage.getNumber());
        return response;
    }

    public User login(User login) {

        Example<User> example = Example.of(login);
        List<User> users = repository.findAll(example);

        Log.log(users.toString(),Log.TEXT_RED);
        if (users.size() > 0) {
            return users.get(0);
        }

        return new User();
    }

    public User update(User user) {
        return repository.save(user);
    }

    public String delete(User user) {
        repository.delete(user);
        if (repository.findById(user.getId()).isPresent()) {
            return "User not deleted";
        }
        return "User deleted";
    }

}

