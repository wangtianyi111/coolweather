package com.coolweather.app.coolweather.model;

/**
 * Created by Administrator on 2016/11/12.
 */

public class County {
    private int id;
    private String countyName;
    private String countyCode;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }
}
