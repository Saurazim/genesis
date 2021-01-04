package com.cocorette.genesis.model.bo;

public class CentreBo {
    private int id;
    private String nom;
    private float longitude;
    private float latitude;

    public CentreBo(){}

    public CentreBo(String name) {
        this.nom = name;
    }

    public CentreBo(int id, String name) {
        this.id = id;
        this.nom = name;
    }

    public CentreBo(String name, float longitude, float latitude) {
        this.nom = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
