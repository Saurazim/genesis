package com.cocorette.genesis.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "centre")
public class CentreEntity {
    @Id
    private int id;
    private String name;
    private float longitude;
    private float latitude;

    public CentreEntity(){}

    public CentreEntity(String name) {
        this.name = name;
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