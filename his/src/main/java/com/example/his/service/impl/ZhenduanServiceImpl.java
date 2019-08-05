package com.example.his.service.impl;

import com.example.his.dao.zhenduanDao;
import com.example.his.pojo.CaseInfo;
import com.example.his.pojo.Register;
import com.example.his.service.ZhenduanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhenduanServiceImpl implements ZhenduanService {
    @Autowired
    private zhenduanDao zhenduanDao;

    @Override
    public List<Register> getRegisterByDoctor(int doctorId, int diagState) {
        return zhenduanDao.getRegisterByDoctor(doctorId,diagState);
    }

    @Override
    public boolean addCaseInfo(String caseNo, String caseInfo) {
        CaseInfo caseInfo1 = new CaseInfo();
        caseInfo1.setcNo(caseNo);
        caseInfo1.setcInfo(caseInfo);
        if (zhenduanDao.addCaseInfo(caseInfo1)){
            return zhenduanDao.updateDlagStateByCaseNo(caseNo);
        }
        return false;
    }
}
