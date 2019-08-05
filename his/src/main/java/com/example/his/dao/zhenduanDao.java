package com.example.his.dao;

import com.example.his.pojo.CaseInfo;
import com.example.his.pojo.Register;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface zhenduanDao {
    //根据医生获取挂号信息
    public List<Register> getRegisterByDoctor(@Param("doctorId") int doctorId, @Param("diagState") int diagState);

    //诊断
    public boolean addCaseInfo(CaseInfo caseInfo);

    //更新诊断状态
    public boolean updateDlagStateByCaseNo(String caseNo);
}
