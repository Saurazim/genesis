package com.cocorette.genesis.model.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "veterinaire")
public class VeterinaireEntity {
    @Id
    @GeneratedValue
    private int id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "gpsId")
    private GpsEntity gps;
    private String commentaire;
    private boolean active;
    private boolean archive;
    private LocalDateTime created;
    private LocalDateTime modified;

    public VeterinaireEntity(){}

    public VeterinaireEntity(String nom) {
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

    public GpsEntity getGps() {
        return gps;
    }

    public void setGps(GpsEntity gps) {
        this.gps = gps;
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
