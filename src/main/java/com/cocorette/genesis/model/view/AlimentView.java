package com.cocorette.genesis.model.view;

public class AlimentView {
    private int id;
    private String nom;

    public AlimentView(){}

    public AlimentView(int id, String nom) {
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
