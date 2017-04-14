package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 省
 * Created by Eason on 2017/4/14.
 */

public class Province extends DataSupport {

    private int id ;

    private String provinceName ;

    private int provinceCode ;//省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
