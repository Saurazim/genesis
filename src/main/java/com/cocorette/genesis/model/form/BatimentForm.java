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
    //private String docCharte;//document, get chemin to doc charte
    private int anneeCharte;
    private String eau;
    private int distCentre;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate contratDebut;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate contratFin;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate certifBioDebut;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate certifBioFin;
    private int anneeDebut;
    private float latitude;
    private float longitude;
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
