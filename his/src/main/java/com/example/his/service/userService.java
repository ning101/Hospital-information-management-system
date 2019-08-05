package com.example.his.service;

import com.example.his.pojo.DoctorInfo;

public interface userService {
    //用户登录
    public DoctorInfo login(String userName, String password);

    //用户注册
    public boolean register(String username,String code,int dep,String pwd,String pwd2);
}
