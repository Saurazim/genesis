package com.cocorette.genesis.bo;

public class CentreBo {
    private String name;
    private float longitude;
    private float latitude;

    public CentreBo(){}

    public CentreBo(String name) {
        this.name = name;
    }

    public CentreBo(String name, float longitude, float latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}
