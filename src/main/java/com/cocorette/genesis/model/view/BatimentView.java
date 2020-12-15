package com.cocorette.genesis.model.view;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BatimentView {
    private int id;
    private String inuav;
    private String entreprise;
    private int entrepriseId;
    private String docCharte;
    private LocalDate contratDebut;
    private LocalDate contratFin;
    private LocalDate certifBioDebut;
    private LocalDate certifBioFin;
    private String rue;
    private String codePostal;
    private String ville;
    private String pays;
    private String commentaire;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean actif;
    private boolean archive;

    public BatimentView(){}

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

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    public int getEntrepriseId() {
        return entrepriseId;
    }

    public void setEntrepriseId(int entrepriseId) {
        this.entrepriseId = entrepriseId;
    }

    public String getDocCharte() {
        return docCharte;
    }

    public void setDocCharte(String docCharte) {
        this.docCharte = docCharte;
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

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
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
}
