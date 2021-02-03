package com.zjc.controller;/*

    @author  zjc
    @create 2021-02-03-16:23
     
*/

import com.zjc.entity.User;
import com.zjc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserContorller {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User gerUser(@PathVariable("id") Integer id){
        User user = userRepository.getOne(id);
        return user;
    }

    @GetMapping("/user")
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;

    }

}
