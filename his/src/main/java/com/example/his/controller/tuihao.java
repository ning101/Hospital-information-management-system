package com.example.his.controller;

import com.example.his.pojo.Register;
import com.example.his.service.tuihaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tuihao {
    @Autowired
    private tuihaoService tuihaoService;

    @PostMapping("/getRegisterByIdCard")
    public Register getRegisterByIdCard(String idCard){
        return tuihaoService.getRegisterByIdCard(idCard);
    }

    @PostMapping("/unRegisterById")
    public boolean unRegisterById(String registerId){
        return tuihaoService.unRegister(registerId);
    }
}
