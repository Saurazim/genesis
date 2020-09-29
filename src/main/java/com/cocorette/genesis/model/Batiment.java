package com.cocorette.genesis.model;

public class Batiment {
    private int id;
    private String inuav;
    //FIXME transient?
    private Entreprise entreprise;

    public Batiment(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInuav() {
        return inuav;
    }

    public void setInuav(String inuav) {
        this.inuav = inuav;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}
