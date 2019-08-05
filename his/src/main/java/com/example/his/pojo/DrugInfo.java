package com.example.his.pojo;

import org.apache.ibatis.type.Alias;

@Alias("drug")
public class DrugInfo {
    private int id;
    private String dgName;
    private String dgSpec;
    private double dgPrice;
    private int dgInv;
    private String dgUit;

    public DrugInfo(){

    }

    public DrugInfo(int id, String dgName, String dgSpec, double dgPrice, int dgInv, String dgUit) {
        this.id = id;
        this.dgName = dgName;
        this.dgSpec = dgSpec;
        this.dgPrice = dgPrice;
        this.dgInv = dgInv;
        this.dgUit = dgUit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDgInv() {
        return dgInv;
    }

    public void setDgInv(int dgInv) {
        this.dgInv = dgInv;
    }

    public String getDgUit() {
        return dgUit;
    }

    public void setDgUit(String dgUit) {
        this.dgUit = dgUit;
    }

    @Override
    public String toString() {
        return "DrugInfo{" +
                "id=" + id +
                ", dgName='" + dgName + '\'' +
                ", dgSpec='" + dgSpec + '\'' +
                ", dgPrice=" + dgPrice +
                ", dgInv=" + dgInv +
                ", dgUit='" + dgUit + '\'' +
                '}';
    }
}
