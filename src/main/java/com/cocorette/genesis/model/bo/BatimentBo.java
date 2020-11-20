package com.cocorette.genesis.model.bo;

import com.cocorette.genesis.model.entity.GpsEntity;
import com.cocorette.genesis.model.transitionnel.EntreprisePo;

import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class BatimentBo {
    private int id;
    private String inuav;
    private AdresseBo adresseBo;
    private EntreprisePo entreprisePo;
    private String docCharte;
    private int anneeCharte;
    private String eau;
    private int distCentre;
    private LocalDate contratDebut;
    private LocalDate contratFin;
    private LocalDate certifBioDebut;
    private LocalDate certifBioFin;
    private int anneeDebut;
    private GpsBo gps;
    private String commentaires;
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

    public GpsBo getGps() {
        return gps;
    }

    public void setGps(GpsBo gps) {
        this.gps = gps;
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
