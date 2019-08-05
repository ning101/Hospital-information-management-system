package com.example.his.pojo;

import org.apache.ibatis.type.Alias;

@Alias("case")
public class CaseInfo {
    private int id;
    private String cNo;
    private String cInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcNo() {
        return cNo;
    }

    public void setcNo(String cNo) {
        this.cNo = cNo;
    }

    public String getcInfo() {
        return cInfo;
    }

    public void setcInfo(String cInfo) {
        this.cInfo = cInfo;
    }
}
