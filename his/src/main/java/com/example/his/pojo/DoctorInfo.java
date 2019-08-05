package com.example.his.pojo;

import org.apache.ibatis.type.Alias;

@Alias("doctor")
public class DoctorInfo {
    private int id;
    private String code;
    private String userName;
    private String pwd;
    private int dep;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getDep() {
        return dep;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "DoctorInfo{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", dep=" + dep +
                '}';
    }
}
