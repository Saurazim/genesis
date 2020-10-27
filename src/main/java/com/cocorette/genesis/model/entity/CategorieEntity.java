package com.cocorette.genesis.model.entity;

import javax.persistence.Entity;

@Entity(name = "categorie")
public class CategorieEntity {
    private int id;
    private String nom;

    public CategorieEntity(){}

    public CategorieEntity(int id) {
        this.id = id;
    }

    public CategorieEntity(String nom) {
        this.nom = nom;
    }

    public CategorieEntity(int id, String nom) {
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
