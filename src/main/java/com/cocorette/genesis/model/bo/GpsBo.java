package com.cocorette.genesis.model.bo;

public class GpsBo {
    private int id;
    private float latitude;
    private float longitude;

    public GpsBo(){}

    public GpsBo(int id) {
        this.id = id;
    }

    public GpsBo(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
