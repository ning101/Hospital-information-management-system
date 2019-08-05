package com.example.his.controller;

import com.example.his.pojo.Department;
import com.example.his.pojo.DoctorInfo;
import com.example.his.pojo.Register;
import com.example.his.service.guahaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class guahao {
    @Autowired
    private guahaoService guahaoService;

    @PostMapping("/getDep")
    public List<Department> getDep(){
        List<Department> result = guahaoService.findDep();
        return result;
    }

    @PostMapping("/getDoctor")
    public List<DoctorInfo> getDoctor(int keshi){
        return guahaoService.findDoctor(keshi);
    }

    @PostMapping("/addRegister")
    public boolean addRegister(Register register){
        return guahaoService.guahao(register);
    }

    @PostMapping("/getRegister")
    public List<Register> getRegister(){
        return guahaoService.getRegister();
    }

}
