package com.cocorette.genesis.bo;

public class VeterinaireBo {
    private String name;
    private float longitude;
    private float latitude;

    public VeterinaireBo(){}

    public VeterinaireBo(String name) {
        this.name = name;
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

