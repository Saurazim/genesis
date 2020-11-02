package com.cocorette.genesis.model.form;

import java.time.LocalDate;

public class LotForm {
    private String codeOeuf;
    private int dureeProdTheorique;
    private int batimentId;
    private String batimentNom;
    private int categorieId;
    private String categorieNom;
    private int couvoirId;
    private String couvoirNom;
    private int soucheId;
    private String soucheNom;
    private int alimentId;
    private String alimentNom;
    private int nbPoulesMEP;
    private LocalDate finLotTheorique;
    private boolean dernierLot;
    private LocalDate naissancePoules;
    private LocalDate mep;

    public LotForm(){}

    public String getCodeOeuf() {
        return codeOeuf;
    }

    public void setCodeOeuf(String codeOeuf) {
        this.codeOeuf = codeOeuf;
    }

    public int getDureeProdTheorique() {
        return dureeProdTheorique;
    }

    public void setDureeProdTheorique(int dureeProdTheorique) {
        this.dureeProdTheorique = dureeProdTheorique;
    }

    public int getBatimentId() {
        return batimentId;
    }

    public void setBatimentId(int batimentId) {
        this.batimentId = batimentId;
    }

    public String getBatimentNom() {
        return batimentNom;
    }

    public void setBatimentNom(String batimentNom) {
        this.batimentNom = batimentNom;
    }

    public int getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
    }

    public String getCategorieNom() {
        return categorieNom;
    }

    public void setCategorieNom(String categorieNom) {
        this.categorieNom = categorieNom;
    }

    public int getCouvoirId() {
        return couvoirId;
    }

    public void setCouvoirId(int couvoirId) {
        this.couvoirId = couvoirId;
    }

    public String getCouvoirNom() {
        return couvoirNom;
    }

    public void setCouvoirNom(String couvoirNom) {
        this.couvoirNom = couvoirNom;
    }

    public int getSoucheId() {
        return soucheId;
    }

    public void setSoucheId(int soucheId) {
        this.soucheId = soucheId;
    }

    public String getSoucheNom() {
        return soucheNom;
    }

    public void setSoucheNom(String soucheNom) {
        this.soucheNom = soucheNom;
    }

    public int getAlimentId() {
        return alimentId;
    }

    public void setAlimentId(int alimentId) {
        this.alimentId = alimentId;
    }

    public String getAlimentNom() {
        return alimentNom;
    }

    public void setAlimentNom(String alimentNom) {
        this.alimentNom = alimentNom;
    }

    public int getNbPoulesMEP() {
        return nbPoulesMEP;
    }

    public void setNbPoulesMEP(int nbPoulesMEP) {
        this.nbPoulesMEP = nbPoulesMEP;
    }

    public LocalDate getFinLotTheorique() {
        return finLotTheorique;
    }

    public void setFinLotTheorique(LocalDate finLotTheorique) {
        this.finLotTheorique = finLotTheorique;
    }

    public boolean isDernierLot() {
        return dernierLot;
    }

    public void setDernierLot(boolean dernierLot) {
        this.dernierLot = dernierLot;
    }

    public LocalDate getNaissancePoules() {
        return naissancePoules;
    }

    public void setNaissancePoules(LocalDate naissancePoules) {
        this.naissancePoules = naissancePoules;
    }

    public LocalDate getMep() {
        return mep;
    }

    public void setMep(LocalDate mep) {
        this.mep = mep;
    }
}