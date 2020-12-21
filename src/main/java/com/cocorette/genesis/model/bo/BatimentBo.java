package com.cocorette.genesis.model.bo;

import com.cocorette.genesis.model.transitionnel.EntreprisePo;

import java.time.LocalDateTime;

public class BatimentBo {
    private int id;
    private String inuav;
    private AdresseBo adresseBo;
    private EntreprisePo entreprisePo;
    private String eau;
    private int distCentre;
    private int anneeDebut;
    private GpsBo gps;
    private String typeBatiment;
    private int nbArbres;
    private String typeArbres;
    private String commentaire;
    private boolean actif;
    private boolean archive;
    private LocalDateTime created;
    private LocalDateTime modified;

    public BatimentBo(int id) {
        this.id = id;
    }

    public BatimentBo(String inuav) {
        this.inuav = inuav;
    }

    public BatimentBo() {

    }

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

    public AdresseBo getAdresseBo() {
        return adresseBo;
    }

    public void setAdresseBo(AdresseBo adresseBo) {
        this.adresseBo = adresseBo;
    }

    public EntreprisePo getEntreprisePo() {
        return entreprisePo;
    }

    public void setEntreprisePo(EntreprisePo entreprisePo) {
        this.entreprisePo = entreprisePo;
    }

    public String getEau() {
        return eau;
    }

    public void setEau(String eau) {
        this.eau = eau;
    }

    public int getDistCentre() {
        return distCentre;
    }

    public void setDistCentre(int distCentre) {
        this.distCentre = distCentre;
    }

    public int getAnneeDebut() {
        return anneeDebut;
    }

    public void setAnneeDebut(int anneeDebut) {
        this.anneeDebut = anneeDebut;
    }

    public GpsBo getGps() {
        return gps;
    }

    public void setGps(GpsBo gps) {
        this.gps = gps;
    }

    public String getTypeBatiment() {
        return typeBatiment;
    }

    public void setTypeBatiment(String typeBatiment) {
        this.typeBatiment = typeBatiment;
    }

    public int getNbArbres() {
        return nbArbres;
    }

    public void setNbArbres(int nbArbres) {
        this.nbArbres = nbArbres;
    }

    public String getTypeArbres() {
        return typeArbres;
    }

    public void setTypeArbres(String typeArbres) {
        this.typeArbres = typeArbres;
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
