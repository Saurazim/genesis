package com.cocorette.genesis.model.bo;

public class ArriveeEauBo {
    private int id;
    private String nom;

    public ArriveeEauBo(){}

    public ArriveeEauBo(int id) {
        this.id = id;
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
