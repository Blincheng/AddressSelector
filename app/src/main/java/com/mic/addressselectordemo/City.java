package com.mic.addressselectordemo;

import com.mic.adressselectorlib.CityInterface;

/**
 * Author: Blincheng.
 * Date: 2017/5/9.
 * Description:
 */

public class City implements CityInterface{
    private String Name;
    private String id;
    private String Grade;
    private String IsMunicipality;

    public String getIsMunicipality() {
        return IsMunicipality;
    }

    public void setIsMunicipality(String isMunicipality) {
        IsMunicipality = isMunicipality;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    @Override
    public String getCityName() {
        return Name;
    }
}
