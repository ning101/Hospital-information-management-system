package com.example.his.controller;

import com.example.his.pojo.PayInfo;
import com.example.his.service.TuifeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class tuifei {
    @Autowired
    private TuifeiService tuifeiService;

    @PostMapping("/getUnPayByCaseNo")
    public List<PayInfo> getUnPayByCaseNo(String caseNo){
        return tuifeiService.getUnPayByCaseNo(caseNo);
    }

    @PostMapping("/unAllPayByCaseNo")
    public boolean unAllPayByCaseNo(String caseNo){
        return tuifeiService.unAllPayByCaseNo(caseNo);
    }

    @PostMapping("/unPayById")
    public boolean unPayByCaseNo(String[] arr){
        return tuifeiService.unPayByCaseNo(arr);
    }
}
