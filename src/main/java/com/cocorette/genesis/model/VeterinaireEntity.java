package com.cocorette.genesis.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VeterinaireEntity {
    @Id
    private int id;
    private String nom;
    private float longitude;
    private float latitude;

    public VeterinaireEntity(){}

    public VeterinaireEntity(String nom) {
        this.nom = nom;
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
