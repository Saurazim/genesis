package com.cocorette.genesis.model.table;

public class SoucheTable {
    private int id;
    private String nom;

    public SoucheTable(){}

    public SoucheTable(int id, String nom) {
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
