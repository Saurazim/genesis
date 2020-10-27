package com.cocorette.genesis.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "aliment")
public class AlimentEntity {
    @Id
    @GeneratedValue
    private int id;
    private String nom;

    public AlimentEntity(){}

    public AlimentEntity(int id, String nom) {
        this.id = id;
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
}
