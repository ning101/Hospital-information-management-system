package com.example.his.dao;

import com.example.his.pojo.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface tuihaoDao {
    //身份证读卡
    public Register getRegisterByIdCard(String idCard);

    //退号
    public int unRegister(String registerId);
}
