package com.example.his.service;

import com.example.his.pojo.Register;

import java.util.List;

public interface ZhenduanService {
    //根据医生获取挂号信息
    public List<Register> getRegisterByDoctor(int doctorId, int diagState);

    //诊断
    public boolean addCaseInfo(String caseNo, String caseInfo);
}
