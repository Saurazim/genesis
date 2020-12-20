package com.cocorette.genesis.model.table;

public class CategorieTable {
    private int id;
    private String nom;

    public CategorieTable(){}

    public CategorieTable(int id) {
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
