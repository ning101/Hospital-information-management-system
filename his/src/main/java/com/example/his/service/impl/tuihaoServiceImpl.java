package com.example.his.service.impl;

import com.example.his.dao.tuihaoDao;
import com.example.his.pojo.Register;
import com.example.his.service.tuihaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tuihaoServiceImpl implements tuihaoService {
    @Autowired
    private tuihaoDao tuihaoDao;

    @Override
    public Register getRegisterByIdCard(String idCard) {
        return tuihaoDao.getRegisterByIdCard(idCard);
    }

    @Override
    public boolean unRegister(String registerId) {
        if (tuihaoDao.unRegister(registerId) > 0){
            return true;
        }else{
            return false;
        }
    }
}
