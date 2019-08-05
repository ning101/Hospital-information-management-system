package com.example.his.service.impl;

import com.example.his.dao.TuifeiDao;
import com.example.his.pojo.PayInfo;
import com.example.his.service.TuifeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuifeiServiceImpl implements TuifeiService {
    @Autowired
    private TuifeiDao tuifeiDao;

    @Override
    public List<PayInfo> getUnPayByCaseNo(String caseNo) {
        return tuifeiDao.getUnPayByCaseNo(caseNo);
    }

    @Override
    public boolean unAllPayByCaseNo(String caseNo) {
        return tuifeiDao.unAllPayByCaseNo(caseNo);
    }

    @Override
    public boolean unPayByCaseNo(String[] arr) {
        boolean flag = true;
        for (String item : arr){
            String[] result = item.split("-");
            int id = Integer.parseInt(result[0]);
            int num = Integer.parseInt(result[1]);
            double money = num * Double.parseDouble(result[2]);
            if (! tuifeiDao.unPayByCaseNo(id,num,money)){
                flag = false;
            }
        }
        return flag;
    }
}
