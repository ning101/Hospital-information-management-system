package com.example.his.service;

import com.example.his.pojo.Department;
import com.example.his.pojo.DoctorInfo;
import com.example.his.pojo.Register;

import java.util.List;

public interface guahaoService {
    //获取所有科室
    public List<Department> findDep();

    //获取科室的所有医生
    public List<DoctorInfo> findDoctor(int keshi);

    //挂号
    public boolean guahao(Register register);

    //获取挂号信息列表
    public List<Register> getRegister();
}
