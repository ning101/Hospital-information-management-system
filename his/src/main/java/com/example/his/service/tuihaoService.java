package com.example.his.service;

import com.example.his.pojo.Register;

import java.util.List;

public interface tuihaoService {
    //身份证读卡
    public Register getRegisterByIdCard(String idCard);

    //退号
    public boolean unRegister(String registerId);
}
