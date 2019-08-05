package com.example.his.controller;

import com.example.his.pojo.Register;
import com.example.his.service.ZhenduanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class zhenduan {
    @Autowired
    private ZhenduanService zhenduanService;

    @PostMapping("/getRegisterByDoctor")
    public List<Register> getRegisterByDoctor(int doctorId,int diagState){
        return zhenduanService.getRegisterByDoctor(doctorId,diagState);
    }

    @PostMapping("/addCaseInfo")
    public boolean addCaseInfo(String caseNo, String caseInfo){
        return zhenduanService.addCaseInfo(caseNo,caseInfo);
    }
}
