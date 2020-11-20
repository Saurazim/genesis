package com.cocorette.genesis.model.bo;

public class SoucheBo {
    private int id;
    private String nom;

    public SoucheBo(){}

    public SoucheBo(int id){
        this.id = id;
    }

    public SoucheBo(int id, String nom) {
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
