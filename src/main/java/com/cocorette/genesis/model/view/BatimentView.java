package com.cocorette.genesis.model.view;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BatimentView {
    private int id;
    private String codeInterne;
    private String inuav;
    private String entreprise;
    private int entrepriseId;
    private String rue;
    private String codePostal;
    private String ville;
    private String pays;
    private String eau;
    private int distCentre;
    private int anneeDebut;
    private String typeBatiment;
    private int nbArbres;
    private String typeArbres;
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

    public String getCodeInterne() {
        return codeInterne;
    }

    public void setCodeInterne(String codeInterne) {
        this.codeInterne = codeInterne;
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
