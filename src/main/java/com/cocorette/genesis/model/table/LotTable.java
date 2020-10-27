package com.cocorette.genesis.model.table;

import java.time.LocalDate;

public class LotTable {
    private int id;
    private String codeOeuf;
    private String inuav;
    private String categorie;
    private String couvoir;
    private String souche;
    private String aliment;
    private int nbPoulesMEP;
    private int coefErosion;
    private LocalDate mep;

    public LotTable(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeOeuf() {
        return codeOeuf;
    }

    public void setCodeOeuf(String codeOeuf) {
        this.codeOeuf = codeOeuf;
    }

    public String getInuav() {
        return inuav;
    }

    public void setInuav(String inuav) {
        this.inuav = inuav;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCouvoir() {
        return couvoir;
    }

    public void setCouvoir(String couvoir) {
        this.couvoir = couvoir;
    }

    public String getSouche() {
        return souche;
    }

    public void setSouche(String souche) {
        this.souche = souche;
    }

    public String getAliment() {
        return aliment;
    }

    public void setAliment(String aliment) {
        this.aliment = aliment;
    }

    public int getNbPoulesMEP() {
        return nbPoulesMEP;
    }

    public void setNbPoulesMEP(int nbPoulesMEP) {
        this.nbPoulesMEP = nbPoulesMEP;
    }

    public int getCoefErosion() {
        return coefErosion;
    }

    public void setCoefErosion(int coefErosion) {
        this.coefErosion = coefErosion;
    }

    public LocalDate getMep() {
        return mep;
    }

    public void setMep(LocalDate mep) {
        this.mep = mep;
    }
}
