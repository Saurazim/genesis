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
    private String commentaire;
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

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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
