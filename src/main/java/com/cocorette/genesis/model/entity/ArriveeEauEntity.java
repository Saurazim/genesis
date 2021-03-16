package com.cocorette.genesis.model.entity;

import javax.persistence.*;

@Entity(name = "arrivee_eau")
public class ArriveeEauEntity {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    private String nom;

    public ArriveeEauEntity(){}

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
}
