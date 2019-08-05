package com.example.his.service.impl;

import com.example.his.dao.guahaoDao;
import com.example.his.pojo.Department;
import com.example.his.pojo.DoctorInfo;
import com.example.his.pojo.Register;
import com.example.his.service.guahaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class guahaoServiceImpl implements guahaoService {
    @Autowired
    private guahaoDao guahaoDao;

    @Override
    public List<Department> findDep() {
        return guahaoDao.findDep();
    }

    @Override
    public List<DoctorInfo> findDoctor(int keshi) {
        return guahaoDao.findDoctor(keshi);
    }

    @Override
    public boolean guahao(Register register) {
        if (guahaoDao.guahao(register) > 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Register> getRegister() {
        return guahaoDao.getRegister();
    }
}
