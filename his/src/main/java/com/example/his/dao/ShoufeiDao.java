package com.example.his.dao;

import com.example.his.pojo.DrugInfo;
import com.example.his.pojo.PayInfo;
import com.example.his.pojo.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoufeiDao {
    //根据病历号获取患者信息
    public Register getRegisterByCaseNo(String caseNo);

    //根据医生id查询医生xinx
    public String getDoctorById(int drId);

    //查询所有的药品信息
    public List<DrugInfo> getAllDrugInfo();

    //划价
    public boolean addPayInfo(List<PayInfo> detailList);

    //收费
    public List<PayInfo> getPayInfo(String caseNo);

    //缴费
    public boolean upPayState(int[] arr);
}
