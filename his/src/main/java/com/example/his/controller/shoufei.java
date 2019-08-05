package com.example.his.controller;

import com.example.his.pojo.DrugInfo;
import com.example.his.pojo.PayInfo;
import com.example.his.pojo.Register;
import com.example.his.service.ShoufeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class shoufei {
    @Autowired
    private ShoufeiService shoufeiService;

    @PostMapping("/getRegisterByCaseNo")
    public Register getRegisterByCaseNo(String caseNo){
        return shoufeiService.getRegisterByCaseNo(caseNo);
    }

    @PostMapping("/getDoctorById")
    public String getDoctorById(int drId){
        return shoufeiService.getDoctorById(drId);
    }

    @PostMapping("/getAllDrugInfo")
    public List<DrugInfo> getAllDrugInfo(){
        return shoufeiService.getAllDrugInfo();
    }

    @PostMapping("/addPayInfo")
    public boolean addPayDetail(String caseNo, String[] drugArr){
        return shoufeiService.addPayInfo(caseNo,drugArr);
    }

    @PostMapping("/getPayInfo")
    public List<PayInfo> getPayDetail(String caseNo){
        return shoufeiService.getPayInfo(caseNo);
    }

    @PostMapping("/upPayState")
    public boolean upPayState(int[] arr){
        return shoufeiService.upPayState(arr);
    }
}