package com.akshayaap.panditbook.service;

import com.akshayaap.panditbook.model.Search;
import com.akshayaap.panditbook.model.User;
import com.akshayaap.panditbook.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

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


        User user1;
        try {
            user1 = repository.findOneByEmail(login.getEmail(), login.getpHash()).get();
            return user1;
        } catch (NoSuchElementException ex) {
            return new User();
        }

    }

    public User update(User user) {
        User user1;
        try {
            user1 = repository.findOne(new ObjectId( user.getId()), user.getpHash()).get();
            return repository.save(user);
        } catch (NoSuchElementException ex) {
            return new User();
        }
    }

    public String delete(User user) {
        User user1;
        try {
            user1 = repository.findOne(new ObjectId( user.getId()), user.getpHash()).get();
            repository.delete(user);
            return "success";
        } catch (NoSuchElementException ex) {
            return "failure";
        }
    }

}

