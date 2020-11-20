package com.cocorette.genesis.model.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "lot")
public class LotEntity {
    @Id
    @GeneratedValue
    private int id;
    private String codeOeuf;
    @ManyToOne
    @JoinColumn(name = "batimentId")
    private BatimentEntity batimentEntity;
    private int dureeProdTheorique;
    private int dureeProdReelle;
    @ManyToOne
    @JoinColumn(name = "categorieId")
    private CategorieEntity categorieEntity;
    @ManyToOne
    @JoinColumn(name = "couvoirId")
    private CouvoirEntity couvoirEntity;
    @ManyToOne
    @JoinColumn(name = "soucheId")
    private SoucheEntity soucheEntity;
    @ManyToOne
    @JoinColumn(name = "alimentId")
    private AlimentEntity alimentEntity;
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
    private String commentaires;
    private boolean actif;
    private boolean archive;
    private LocalDateTime created;
    private LocalDateTime modified;

    public LotEntity(){}

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

    public BatimentEntity getBatimentEntity() {
        return batimentEntity;
    }

    public void setBatimentEntity(BatimentEntity batimentEntity) {
        this.batimentEntity = batimentEntity;
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

    public CategorieEntity getCategorieEntity() {
        return categorieEntity;
    }

    public void setCategorieEntity(CategorieEntity categorieEntity) {
        this.categorieEntity = categorieEntity;
    }

    public CouvoirEntity getCouvoirEntity() {
        return couvoirEntity;
    }

    public void setCouvoirEntity(CouvoirEntity couvoirEntity) {
        this.couvoirEntity = couvoirEntity;
    }

    public SoucheEntity getSoucheEntity() {
        return soucheEntity;
    }

    public void setSoucheEntity(SoucheEntity soucheEntity) {
        this.soucheEntity = soucheEntity;
    }

    public AlimentEntity getAlimentEntity() {
        return alimentEntity;
    }

    public void setAlimentEntity(AlimentEntity alimentEntity) {
        this.alimentEntity = alimentEntity;
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

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
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
