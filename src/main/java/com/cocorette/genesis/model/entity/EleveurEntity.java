package com.cocorette.genesis.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
public class EleveurEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String prenom;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "contactEntityId")
    private ContactEntity contactEntity;
    @Transient
    private List<EntrepriseEntity> entreprises;

    public EleveurEntity(){}

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

    public ContactEntity getContactEntity() {
        return contactEntity;
    }

    public void setContactEntity(ContactEntity contactEntity) {
        this.contactEntity = contactEntity;
    }

    public List<EntrepriseEntity> getEntreprises() {
        return entreprises;
    }

    public void setEntreprises(List<EntrepriseEntity> entreprises) {
        this.entreprises = entreprises;
    }
}
