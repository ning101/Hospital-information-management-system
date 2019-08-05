package com.example.his.service.impl;

import com.example.his.dao.ShoufeiDao;
import com.example.his.pojo.DrugInfo;
import com.example.his.pojo.PayInfo;
import com.example.his.pojo.Register;
import com.example.his.service.ShoufeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShoufeiServiceImpl implements ShoufeiService {
    @Autowired
    private ShoufeiDao shoufeiDao;

    @Override
    public Register getRegisterByCaseNo(String caseNo) {
        return shoufeiDao.getRegisterByCaseNo(caseNo);
    }

    @Override
    public String getDoctorById(int drId) {
        return shoufeiDao.getDoctorById(drId);
    }

    @Override
    public List<DrugInfo> getAllDrugInfo() {
        return shoufeiDao.getAllDrugInfo();
    }

    @Override
    public boolean addPayInfo(String caseNo, String[] drugArr) {
        List<PayInfo> payInfoList = new ArrayList<>();
        for (String item : drugArr){
            PayInfo pay = new PayInfo();
            //获取系统时间
            pay.setPayDate(new Date(System.currentTimeMillis()));
            //获取药品信息
            String[] result = item.split("-");
            int id = Integer.parseInt(result[0]);
            int num = Integer.parseInt(result[1]);
            int price = Integer.parseInt(result[2]);
            pay.setDgId(id);
            pay.setPayNum(num);
            pay.setPayMoney(num * price);
            pay.setCaseNo(caseNo);
            payInfoList.add(pay);
        }
        return shoufeiDao.addPayInfo(payInfoList);
    }

    @Override
    public List<PayInfo> getPayInfo(String caseNo) {
        List<PayInfo> payInfoList = shoufeiDao.getPayInfo(caseNo);
        for (PayInfo payInfo : payInfoList){
            int totalMoney = payInfo.getPayNum();
        }
        return payInfoList;
    }

    @Override
    public boolean upPayState(int[] arr) {
        return shoufeiDao.upPayState(arr);
    }
}
