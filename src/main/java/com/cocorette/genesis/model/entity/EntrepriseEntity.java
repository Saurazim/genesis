package com.cocorette.genesis.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity(name = "entreprise")
public class EntrepriseEntity {
    @Id
    private int id;
    private String ede;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "veterinaireId")
    private VeterinaireEntity veterinaire;
    @ManyToOne
    @JoinColumn(name = "centreId")
    private CentreEntity centre;
    //localisation
    @ManyToOne
    @JoinColumn(name = "adresseId")
    private AdresseEntity adresse;
    //Contacts
    @ManyToOne
    @JoinColumn(name = "contactId")
    private ContactEntity contact;
    @Nullable
    @ManyToOne
    @JoinColumn(name="eleveurId")
    private EleveurEntity eleveur;
    @Transient
    private List<BatimentEntity> batiments;

    public EntrepriseEntity(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEde() {
        return ede;
    }

    public void setEde(String ede) {
        this.ede = ede;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public VeterinaireEntity getVeterinaire() {
        return veterinaire;
    }

    public void setVeterinaire(VeterinaireEntity veterinaire) {
        this.veterinaire = veterinaire;
    }

    public CentreEntity getCentre() {
        return centre;
    }

    public void setCentre(CentreEntity centre) {
        this.centre = centre;
    }

    public AdresseEntity getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseEntity adresse) {
        this.adresse = adresse;
    }

    public ContactEntity getContact() {
        return contact;
    }

    public void setContact(ContactEntity contact) {
        this.contact = contact;
    }

    public EleveurEntity getEleveur() {
        return eleveur;
    }

    public void setEleveur(EleveurEntity eleveur) {
        this.eleveur = eleveur;
    }

    public List<BatimentEntity> getBatiments() {
        return batiments;
    }

    public void setBatiments(List<BatimentEntity> batiments) {
        this.batiments = batiments;
    }
}
