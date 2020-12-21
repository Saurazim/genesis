package com.cocorette.genesis.model.form;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LotForm {
    private String codeOeuf;
    private Integer batimentId;
    private String batimentNom;
    private Integer categorieId;
    private String categorieNom;
    private int couvoirId;
    private String couvoirNom;
    private Integer soucheId;
    private String soucheNom;
    private Integer alimentId;
    private String alimentNom;
    private Integer nbPoulesMEP;
    private boolean dernierLot;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate naissancePoules;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate mep;
    private String commentaire;
    private LocalDateTime created;
    private LocalDateTime modified;

    public LotForm(){}

    public LotForm(Integer batimentId) {
        this.batimentId = batimentId;
    }

    public String getCodeOeuf() {
        return codeOeuf;
    }

    public void setCodeOeuf(String codeOeuf) {
        this.codeOeuf = codeOeuf;
    }

    public Integer getBatimentId() {
        return batimentId;
    }

    public void setBatimentId(Integer batimentId) {
        this.batimentId = batimentId;
    }

    public String getBatimentNom() {
        return batimentNom;
    }

    public void setBatimentNom(String batimentNom) {
        this.batimentNom = batimentNom;
    }

    public Integer getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Integer categorieId) {
        this.categorieId = categorieId;
    }

    public String getCategorieNom() {
        return categorieNom;
    }

    public void setCategorieNom(String categorieNom) {
        this.categorieNom = categorieNom;
    }

    public Integer getCouvoirId() {
        return couvoirId;
    }

    public void setCouvoirId(Integer couvoirId) {
        this.couvoirId = couvoirId;
    }

    public String getCouvoirNom() {
        return couvoirNom;
    }

    public void setCouvoirNom(String couvoirNom) {
        this.couvoirNom = couvoirNom;
    }

    public Integer getSoucheId() {
        return soucheId;
    }

    public void setSoucheId(Integer soucheId) {
        this.soucheId = soucheId;
    }

    public String getSoucheNom() {
        return soucheNom;
    }

    public void setSoucheNom(String soucheNom) {
        this.soucheNom = soucheNom;
    }

    public Integer getAlimentId() {
        return alimentId;
    }

    public void setAlimentId(Integer alimentId) {
        this.alimentId = alimentId;
    }

    public String getAlimentNom() {
        return alimentNom;
    }

    public void setAlimentNom(String alimentNom) {
        this.alimentNom = alimentNom;
    }

    public Integer getNbPoulesMEP() {
        return nbPoulesMEP;
    }

    public void setNbPoulesMEP(Integer nbPoulesMEP) {
        this.nbPoulesMEP = nbPoulesMEP;
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

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }
}
