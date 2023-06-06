package com.example.brf.brfapi.controller;

import com.example.brf.brfapi.user.DataUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @PostMapping
    public void register(@RequestBody DataUser data){
        System.out.println(data);
    }


}
