package com.cocorette.genesis.model.bo;

import com.cocorette.genesis.model.transitionnel.EleveurPo;

import java.time.LocalDateTime;

public class EntrepriseBo {
    private int id;
    private String nom;
    private String ede;
    private CentreBo centreBo;
    private AdresseBo adresseBo;
    private ContactBo contactBo;
    private EleveurPo eleveurPo;
    private VeterinaireBo veterinaireBo;
    private String commentaire;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEde() {
        return ede;
    }

    public void setEde(String ede) {
        this.ede = ede;
    }

    public CentreBo getCentreBo() {
        return centreBo;
    }

    public void setCentreBo(CentreBo centreBo) {
        this.centreBo = centreBo;
    }

    public AdresseBo getAdresseBo() {
        return adresseBo;
    }

    public void setAdresseBo(AdresseBo adresseBo) {
        this.adresseBo = adresseBo;
    }

    public ContactBo getContactBo() {
        return contactBo;
    }

    public void setContactBo(ContactBo contactBo) {
        this.contactBo = contactBo;
    }

    public EleveurPo getEleveurPo() {
        return eleveurPo;
    }

    public void setEleveurPo(EleveurPo eleveurPo) {
        this.eleveurPo = eleveurPo;
    }

    public VeterinaireBo getVeterinaireBo() {
        return veterinaireBo;
    }

    public void setVeterinaireBo(VeterinaireBo veterinaireBo) {
        this.veterinaireBo = veterinaireBo;
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
