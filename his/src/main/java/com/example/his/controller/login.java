package com.example.his.controller;

import com.example.his.pojo.DoctorInfo;
import com.example.his.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {
    @Autowired
    private userService userService;

    @PostMapping("/login_check")
    public DoctorInfo loginCheck(String username, String password){
        return userService.login(username,password);
    }

    @PostMapping("/register")
    public boolean register(String username,String code,int dep, String pwd, String pwd2){
        return userService.register(username,code,dep,pwd,pwd2);
    }
}