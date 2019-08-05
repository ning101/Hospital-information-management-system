package com.example.his.service.impl;

import com.example.his.dao.userDao;
import com.example.his.pojo.DoctorInfo;
import com.example.his.pojo.User;
import com.example.his.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private userDao userDao;

    @Override
    public DoctorInfo login(String userName, String password) {
        if (userName.equals("") || password.equals("")){
            return null;
        }
        DoctorInfo doctorInfo = userDao.findDoctor(userName);
        if (doctorInfo.getPwd().equals(password)){
            return doctorInfo;
        }
        return null;
    }

    @Override
    public boolean register(String username, String code, int dep, String pwd, String pwd2) {
        if (! pwd.equals(pwd2)){
            return false;
        }
        DoctorInfo doctorInfo = new DoctorInfo();
        doctorInfo.setUserName(username);
        doctorInfo.setCode(code);
        doctorInfo.setDep(dep);
        doctorInfo.setPwd(pwd);
        return userDao.register(doctorInfo);
    }
}
