package com.cocorette.genesis.model.bo;

public class GpsBo {
    private int id;
    private float latutide;
    private float longitude;

    public GpsBo(){}

    public GpsBo(int id) {
        this.id = id;
    }

    public GpsBo(float latutide, float longitude) {
        this.latutide = latutide;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLatutide() {
        return latutide;
    }

    public void setLatutide(float latutide) {
        this.latutide = latutide;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
