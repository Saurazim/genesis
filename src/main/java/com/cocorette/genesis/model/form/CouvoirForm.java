package com.cocorette.genesis.model.form;

public class CouvoirForm {
    private String nom;

    public CouvoirForm(){}

    public CouvoirForm(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
