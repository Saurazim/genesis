package com.cocorette.genesis.model.view;

import java.time.LocalDate;

public class LotView {
    private int id;
    private String codeOeuf;
    private String batiment;
    private int batimentId;
    private String categorie;
    private String couvoir;
    private String souche;
    private String aliment;
    private int dureeProdTheorique;
    private int dureeProdReelle;
    private int nbPoulesMEP;
    private LocalDate finLotTheorique;
    private int coefErosion;
    private boolean dernierLot;
    //dates
    private LocalDate naissancePoules;
    private LocalDate mep;
    private LocalDate finLot;
    private LocalDate analyse1;
    private LocalDate analyse2;
    private LocalDate prelevement1;
    private LocalDate prelevement2;
    private LocalDate prelevement3;
    private LocalDate prelevement4;

    public LotView() {}

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

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public int getBatimentId() {
        return batimentId;
    }

    public void setBatimentId(int batimentId) {
        this.batimentId = batimentId;
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

    public int getDureeProdTheorique() {
        return dureeProdTheorique;
    }

    public void setDureeProdTheorique(int dureeProdTheorique) {
        this.dureeProdTheorique = dureeProdTheorique;
    }

    public int getDureeProdReelle() {
        return dureeProdReelle;
    }

    public void setDureeProdReelle(int dureeProdReelle) {
        this.dureeProdReelle = dureeProdReelle;
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

    public int getCoefErosion() {
        return coefErosion;
    }

    public void setCoefErosion(int coefErosion) {
        this.coefErosion = coefErosion;
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

    public LocalDate getFinLot() {
        return finLot;
    }

    public void setFinLot(LocalDate finLot) {
        this.finLot = finLot;
    }

    public LocalDate getAnalyse1() {
        return analyse1;
    }

    public void setAnalyse1(LocalDate analyse1) {
        this.analyse1 = analyse1;
    }

    public LocalDate getAnalyse2() {
        return analyse2;
    }

    public void setAnalyse2(LocalDate analyse2) {
        this.analyse2 = analyse2;
    }

    public LocalDate getPrelevement1() {
        return prelevement1;
    }

    public void setPrelevement1(LocalDate prelevement1) {
        this.prelevement1 = prelevement1;
    }

    public LocalDate getPrelevement2() {
        return prelevement2;
    }

    public void setPrelevement2(LocalDate prelevement2) {
        this.prelevement2 = prelevement2;
    }

    public LocalDate getPrelevement3() {
        return prelevement3;
    }

    public void setPrelevement3(LocalDate prelevement3) {
        this.prelevement3 = prelevement3;
    }

    public LocalDate getPrelevement4() {
        return prelevement4;
    }

    public void setPrelevement4(LocalDate prelevement4) {
        this.prelevement4 = prelevement4;
    }
}
