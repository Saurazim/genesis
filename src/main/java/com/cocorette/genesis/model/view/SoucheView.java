package com.cocorette.genesis.model.view;

public class SoucheView {
    private int id;
    private String Nom;

    public SoucheView(){}

    public SoucheView(int id, String nom) {
        this.id = id;
        Nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
}
