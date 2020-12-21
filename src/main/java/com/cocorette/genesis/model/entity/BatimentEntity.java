package com.cocorette.genesis.model.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.List;

@Entity(name = "batiment")
public class BatimentEntity {
    @Id
    @GeneratedValue
    private int id;
    private String inuav;
    @ManyToOne
    @JoinColumn(name = "adresseId")
    private AdresseEntity adresse;
    @ManyToOne
    @JoinColumn(name = "entrepriseId")
    private EntrepriseEntity entreprise;
    private String eau;
    private int distCentre;
    private int anneeDebut;
    @ManyToOne
    @JoinColumn(name = "gpsId")
    private GpsEntity gps;
    private String typeBatiment;
    private int nbArbres;
    private String typeArbres;
    @Transient
    private List<String> documents;
    private String commentaire;
    private boolean actif;
    private boolean archive;
    private LocalDateTime created;
    private LocalDateTime modified;
    @Transient
    private List<LotEntity> lots;


    public BatimentEntity(){}

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

    public AdresseEntity getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseEntity adresse) {
        this.adresse = adresse;
    }

    public EntrepriseEntity getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(EntrepriseEntity entreprise) {
        this.entreprise = entreprise;
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

    public GpsEntity getGps() {
        return gps;
    }

    public void setGps(GpsEntity gps) {
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

    public List<String> getDocuments() {
        return documents;
    }

    public void setDocuments(List<String> documents) {
        this.documents = documents;
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

    public List<LotEntity> getLots() {
        return lots;
    }

    public void setLots(List<LotEntity> lots) {
        this.lots = lots;
    }
}
