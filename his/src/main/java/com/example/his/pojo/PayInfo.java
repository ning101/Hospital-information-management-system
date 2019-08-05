package com.example.his.pojo;

import org.apache.ibatis.type.Alias;

import java.sql.Date;

@Alias("pay")
public class PayInfo {
    private int id;
    private int dgId;
    private String caseNo;
    private int payNum;
    private double payMoney;
    private Date payDate;
    private int payState;
    private String remark;

    //扩展字段
    private String dgName;  //药品名称
    private String dgSpec;  //药品规格
    private double dgPrice; //药品价格
    private String dgUit;   //药品单位

    //挂号信息表
    private String rname;
    private int settleType;

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public int getSettleType() {
        return settleType;
    }

    public void setSettleType(int settleType) {
        this.settleType = settleType;
    }

    public String getDgName() {
        return dgName;
    }

    public void setDgName(String dgName) {
        this.dgName = dgName;
    }

    public String getDgSpec() {
        return dgSpec;
    }

    public void setDgSpec(String dgSpec) {
        this.dgSpec = dgSpec;
    }

    public double getDgPrice() {
        return dgPrice;
    }

    public void setDgPrice(double dgPrice) {
        this.dgPrice = dgPrice;
    }

    public String getDgUit() {
        return dgUit;
    }

    public void setDgUit(String dgUit) {
        this.dgUit = dgUit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDgId() {
        return dgId;
    }

    public void setDgId(int dgId) {
        this.dgId = dgId;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public int getPayNum() {
        return payNum;
    }

    public void setPayNum(int payNum) {
        this.payNum = payNum;
    }

    public double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(double payMoney) {
        this.payMoney = payMoney;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public int getPayState() {
        return payState;
    }

    public void setPayState(int payState) {
        this.payState = payState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "PayInfo{" +
                "id=" + id +
                ", dgId=" + dgId +
                ", caseNo='" + caseNo + '\'' +
                ", payNum=" + payNum +
                ", payMoney=" + payMoney +
                ", payDate=" + payDate +
                ", payState=" + payState +
                ", remark='" + remark + '\'' +
                '}';
    }
}
