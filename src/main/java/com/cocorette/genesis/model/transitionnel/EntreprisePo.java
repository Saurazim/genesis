package com.cocorette.genesis.model.transitionnel;

public class EntreprisePo {
    private int id;
    private String ede;
    private String nom;

    public EntreprisePo(){}

    public EntreprisePo(int id) {
        this.id = id;
    }

    public EntreprisePo(String ede, String nom) {
        this.ede = ede;
        this.nom = nom;
    }

    public EntreprisePo(int id, String ede, String nom) {
        this.id = id;
        this.ede = ede;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEde() {
        return ede;
    }

    public void setEde(String ede) {
        this.ede = ede;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
