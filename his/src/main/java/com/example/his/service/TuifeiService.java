package com.example.his.service;

import com.example.his.pojo.PayInfo;

import java.util.List;

public interface TuifeiService {
    //获取退费信息
    public List<PayInfo> getUnPayByCaseNo(String caseNo);

    //全退
    public boolean unAllPayByCaseNo(String caseNo);

    //退费
    public boolean unPayByCaseNo(String[] arr);
}
