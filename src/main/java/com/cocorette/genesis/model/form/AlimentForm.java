package com.cocorette.genesis.model.form;

public class AlimentForm {
    private String nom;

    public AlimentForm(){}

    public AlimentForm(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
