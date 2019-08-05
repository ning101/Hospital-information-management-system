package com.example.his.dao;

import com.example.his.pojo.PayInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TuifeiDao {
    //获取退费信息
    public List<PayInfo> getUnPayByCaseNo(String caseNo);

    //全退
    public boolean unAllPayByCaseNo(String caseNo);

    //退费
    public boolean unPayByCaseNo(@Param("id") int id, @Param("num") int num, @Param("money") double money);
}
