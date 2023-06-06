package com.example.brf.brfapi.controller;

import com.example.brf.brfapi.user.DataUser;
import com.example.brf.brfapi.user.User;
import com.example.brf.brfapi.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public void register(@RequestBody DataUser data){
        System.out.println(new User(data.name(), data.id(), data.role()));
    }


}
