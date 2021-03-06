package com.cocorette.genesis.model.bo;

import com.cocorette.genesis.model.transitionnel.BatimentPo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LotBo {
    private int id;
    private String codeOeuf;
    private BatimentPo batimentPo;
    private int dureeProdTheorique;
    private int dureeProdReelle;
    private CategorieBo categorieBo;
    private CouvoirBo couvoirBo;
    private SoucheBo soucheBo;
    private AlimentBo alimentBo;
    private int nbPoulesMEP;
    private LocalDate finLotTheorique;
    private int coefErosion;
    private boolean dernierLot;
    //dates
    private LocalDate naissancePoules;
    private LocalDate mep;
    private LocalDate finLot;
    private String commentaires;
    private boolean actif;
    private boolean archive;
    private LocalDateTime created;
    private LocalDateTime modified;

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

    public BatimentPo getBatimentPo() {
        return batimentPo;
    }

    public void setBatimentPo(BatimentPo batimentPo) {
        this.batimentPo = batimentPo;
    }

    public void setBatimentPo(int id){
        this.batimentPo.setId(id);
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

    public CategorieBo getCategorieBo() {
        return categorieBo;
    }

    public void setCategorieBo(CategorieBo categorieBo) {
        this.categorieBo = categorieBo;
    }

    public CouvoirBo getCouvoirBo() {
        return couvoirBo;
    }

    public void setCouvoirBo(CouvoirBo couvoirBo) {
        this.couvoirBo = couvoirBo;
    }

    public SoucheBo getSoucheBo() {
        return soucheBo;
    }

    public void setSoucheBo(SoucheBo soucheBo) {
        this.soucheBo = soucheBo;
    }

    public AlimentBo getAlimentBo() {
        return alimentBo;
    }

    public void setAlimentBo(AlimentBo alimentBo) {
        this.alimentBo = alimentBo;
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
