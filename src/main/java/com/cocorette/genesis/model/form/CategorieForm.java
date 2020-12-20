package com.cocorette.genesis.model.form;

import org.springframework.cache.annotation.Cacheable;

public class CategorieForm {
    private String nom;

    public CategorieForm(){}

    public CategorieForm(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
