package com.example.brf.brfapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @PostMapping
    public void register(@RequestBody String jsonn){
        System.out.println(jsonn);
    }


}
