package com.cocorette.genesis.model.bo;

public class CentreBo {
    private int id;
    private String name;
    private float longitude;
    private float latitude;

    public CentreBo(){}

    public CentreBo(String name) {
        this.name = name;
    }

    public CentreBo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CentreBo(String name, float longitude, float latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
