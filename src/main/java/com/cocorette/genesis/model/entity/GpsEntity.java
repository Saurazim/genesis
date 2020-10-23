package com.cocorette.genesis.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "gps")
public class GpsEntity {
    @Id
    @GeneratedValue
    private int id;
    private float latitude;
    private float longitude;

    public GpsEntity(){}

    public GpsEntity(int id) {
        this.id = id;
    }

    public GpsEntity(float latitude, float longitude) {
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
