package com.example.his.pojo;

import org.apache.ibatis.type.Alias;

import java.sql.Date;


@Alias("register")
public class Register {
    private int id;
    private String caseNo;
    private String rname;
    private int sex;
    private int age;
    private Date birthday;
    private int settleType;
    private String mcardNo;
    private int medicalType;
    private String idCard;
    private String address;
    private Date vistDate;
    private int regLevel;
    private int deptNo;
    private int drId;
    private int regPay;
    private int regSrc;
    private int diagState;
    private int regState;
    //扩展字段
    private String cInfo;

    public Register(){

    }

    public Register(int id, String caseNo, String rname, int sex, int age, Date birthday, int settleType, String mcardNo, int medicalType, String idCard, String address, Date vistDate, int regLevel, int deptNo, int drId, int regPay, int regSrc, int diagState, int regState) {
        this.id = id;
        this.caseNo = caseNo;
        this.rname = rname;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.settleType = settleType;
        this.mcardNo = mcardNo;
        this.medicalType = medicalType;
        this.idCard = idCard;
        this.address = address;
        this.vistDate = vistDate;
        this.regLevel = regLevel;
        this.deptNo = deptNo;
        this.drId = drId;
        this.regPay = regPay;
        this.regSrc = regSrc;
        this.diagState = diagState;
        this.regState = regState;
    }

    public String getcInfo() {
        return cInfo;
    }

    public void setcInfo(String cInfo) {
        this.cInfo = cInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSettleType() {
        return settleType;
    }

    public void setSettleType(int settleType) {
        this.settleType = settleType;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public int getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(int medicalType) {
        this.medicalType = medicalType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getVistDate() {
        return vistDate;
    }

    public void setVistDate(Date vistDate) {
        this.vistDate = vistDate;
    }

    public int getRegLevel() {
        return regLevel;
    }

    public void setRegLevel(int regLevel) {
        this.regLevel = regLevel;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public int getDrId() {
        return drId;
    }

    public void setDrId(int drId) {
        this.drId = drId;
    }

    public int getRegPay() {
        return regPay;
    }

    public void setRegPay(int regPay) {
        this.regPay = regPay;
    }

    public int getRegSrc() {
        return regSrc;
    }

    public void setRegSrc(int regSrc) {
        this.regSrc = regSrc;
    }

    public int getDiagState() {
        return diagState;
    }

    public void setDiagState(int diagState) {
        this.diagState = diagState;
    }

    public int getRegState() {
        return regState;
    }

    public void setRegState(int regState) {
        this.regState = regState;
    }

    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", caseNo='" + caseNo + '\'' +
                ", rname='" + rname + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", birthday=" + birthday +
                ", settleType=" + settleType +
                ", mcardNo='" + mcardNo + '\'' +
                ", medicalType=" + medicalType +
                ", idCard='" + idCard + '\'' +
                ", address='" + address + '\'' +
                ", vistDate=" + vistDate +
                ", regLevel=" + regLevel +
                ", deptNo=" + deptNo +
                ", drId=" + drId +
                ", regPay=" + regPay +
                ", regSrc=" + regSrc +
                ", diagState=" + diagState +
                ", regState=" + regState +
                ", cInfo='" + cInfo + '\'' +
                '}';
    }
}
