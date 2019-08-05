package com.example.his.service;

import com.example.his.pojo.DrugInfo;
import com.example.his.pojo.PayInfo;
import com.example.his.pojo.Register;

import java.util.List;

public interface ShoufeiService {
    //根据病历号查询患者信息
    public Register getRegisterByCaseNo(String caseNo);

    //根据医生id查询医生信息
    public String getDoctorById(int drId);

    //获取所有药品信息
    public List<DrugInfo> getAllDrugInfo();

    //划价
    public boolean addPayInfo(String caseNo, String[] drugArr);

    //收费
    public List<PayInfo> getPayInfo(String caseNo);

    //缴费
    public boolean upPayState(int[] arr);
}
