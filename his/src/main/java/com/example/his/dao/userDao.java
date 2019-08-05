package com.example.his.dao;

import com.example.his.pojo.DoctorInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userDao {
    //以用户名查找用户
    public DoctorInfo findDoctor(String userName);

    //用户注册
    public boolean register(DoctorInfo doctorInfo);
}
