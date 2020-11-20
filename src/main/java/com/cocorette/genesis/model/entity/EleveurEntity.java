package com.cocorette.genesis.model.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "eleveur")
public class EleveurEntity {
    @Id
    @GeneratedValue
    private int id;
    private String prenom;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "contactId")
    private ContactEntity contact;
    @Transient
    private List<EntrepriseEntity> entreprises;
    private String commentaires;
    private boolean actif;
    private boolean archive;
    private LocalDateTime created;
    private LocalDateTime modified;

    public EleveurEntity(){}

    public EleveurEntity(int id){
        this.id = id;
    }

    public EleveurEntity(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ContactEntity getContact() {
        return contact;
    }

    public void setContact(ContactEntity contact) {
        this.contact = contact;
    }

    public List<EntrepriseEntity> getEntreprises() {
        return entreprises;
    }

    public void setEntreprises(List<EntrepriseEntity> entreprises) {
        this.entreprises = entreprises;
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
