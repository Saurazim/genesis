package com.cocorette.genesis.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "entreprises")
public class EntrepriseEntity {
    @Id
    @GeneratedValue
    private int id;
    private String ede;
    private String nom;
    private String tva;
    private String siret;
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
    private String commentaire;
    private boolean actif;
    private boolean archive;
    private LocalDateTime created;
    private LocalDateTime modified;

    public EntrepriseEntity(){}

    public EntrepriseEntity(int id) {
        this.id = id;
    }

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

    public String getTva() {
        return tva;
    }

    public void setTva(String tva) {
        this.tva = tva;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
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
