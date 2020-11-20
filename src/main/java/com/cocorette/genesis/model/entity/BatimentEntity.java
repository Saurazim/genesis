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
    private String docCharte;
    private int anneeCharte;
    private String eau;
    private int distCentre;
    private LocalDate contratDebut;
    private LocalDate contratFin;
    private LocalDate certifBioDebut;
    private LocalDate certifBioFin;
    private int anneeDebut;
    @ManyToOne
    @JoinColumn(name = "gpsId")
    private GpsEntity gps;
    @Transient
    private List<String> documents;
    private String commentaires;
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

    public String getDocCharte() {
        return docCharte;
    }

    public void setDocCharte(String docCharte) {
        this.docCharte = docCharte;
    }

    public int getAnneeCharte() {
        return anneeCharte;
    }

    public void setAnneeCharte(int anneeCharte) {
        this.anneeCharte = anneeCharte;
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

    public LocalDate getContratDebut() {
        return contratDebut;
    }

    public void setContratDebut(LocalDate contratDebut) {
        this.contratDebut = contratDebut;
    }

    public LocalDate getContratFin() {
        return contratFin;
    }

    public void setContratFin(LocalDate contratFin) {
        this.contratFin = contratFin;
    }

    public LocalDate getCertifBioDebut() {
        return certifBioDebut;
    }

    public void setCertifBioDebut(LocalDate certifBioDebut) {
        this.certifBioDebut = certifBioDebut;
    }

    public LocalDate getCertifBioFin() {
        return certifBioFin;
    }

    public void setCertifBioFin(LocalDate certifBioFin) {
        this.certifBioFin = certifBioFin;
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

    public List<String> getDocuments() {
        return documents;
    }

    public void setDocuments(List<String> documents) {
        this.documents = documents;
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

    public List<LotEntity> getLots() {
        return lots;
    }

    public void setLots(List<LotEntity> lots) {
        this.lots = lots;
    }
}
