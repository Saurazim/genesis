package com.cocorette.genesis.model.form;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BatimentForm {
    private String inuav;
    private String rue;
    private String codePostal;
    private String ville;
    private String pays;
    private int entrepriseId;
    private String eau;
    private int distCentre;
    private int anneeDebut;
    private float latitude;
    private float longitude;
    private String typeBatiment;
    private int nbArbres;
    private String typeArbres;
    private String commentaires;
    private LocalDateTime created;
    private LocalDateTime modified;

    public BatimentForm(){}

    public BatimentForm(int entrepriseId) {
        this.entrepriseId = entrepriseId;
    }

    public String getInuav() {
        return inuav;
    }

    public void setInuav(String inuav) {
        this.inuav = inuav;
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

    public int getEntrepriseId() {
        return entrepriseId;
    }

    public void setEntrepriseId(int entrepriseId) {
        this.entrepriseId = entrepriseId;
    }

//    public String getDocCharte() {
//        return docCharte;
//    }
//
//    public void setDocCharte(String docCharte) {
//        this.docCharte = docCharte;
//    }

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

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
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

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
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
