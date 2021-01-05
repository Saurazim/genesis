package com.cocorette.genesis.model.bo;

import com.cocorette.genesis.model.entity.GpsEntity;

import java.time.LocalDateTime;

public class VeterinaireBo {
    private int id;
    private String nom;
    private GpsBo gpsBo;
    private String commentaire;
    private boolean active;
    private boolean archive;
    private LocalDateTime created;
    private LocalDateTime modified;

    public VeterinaireBo(){}

    public VeterinaireBo(String nom) {
        this.nom = nom;
    }

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

    public GpsBo getGpsBo() {
        return gpsBo;
    }

    public void setGpsBo(GpsBo gpsBo) {
        this.gpsBo = gpsBo;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

