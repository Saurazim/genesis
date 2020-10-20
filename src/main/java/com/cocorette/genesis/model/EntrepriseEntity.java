package com.cocorette.genesis.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
public class EntrepriseEntity {
    @Id
    private int id;
    private String ede;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "veterinaireEntityId")
    private VeterinaireEntity veterinaireEntity;
    @ManyToOne
    @JoinColumn(name = "centreEntityId")
    private CentreEntity centreEntity;
    //localisation
    @ManyToOne
    @JoinColumn(name = "adresseEntityId")
    private AdresseEntity adresseEntity;
    //Contacts
    @ManyToOne
    @JoinColumn(name = "contactEntityId")
    private ContactEntity contactEntity;
    @Nullable
    @ManyToOne
    @JoinColumn(name="eleveurEntityId")
    private EleveurEntity eleveurEntity;
    @Transient
    private List<BatimentEntity> batimentEntities;

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

    public VeterinaireEntity getVeterinaireEntity() {
        return veterinaireEntity;
    }

    public void setVeterinaireEntity(VeterinaireEntity veterinaireEntity) {
        this.veterinaireEntity = veterinaireEntity;
    }

    public CentreEntity getCentreEntity() {
        return centreEntity;
    }

    public void setCentreEntity(CentreEntity centreEntity) {
        this.centreEntity = centreEntity;
    }

    public AdresseEntity getAdresseEntity() {
        return adresseEntity;
    }

    public void setAdresseEntity(AdresseEntity adresseEntity) {
        this.adresseEntity = adresseEntity;
    }

    public ContactEntity getContactEntity() {
        return contactEntity;
    }

    public void setContactEntity(ContactEntity contactEntity) {
        this.contactEntity = contactEntity;
    }

    public EleveurEntity getEleveurEntity() {
        return eleveurEntity;
    }

    public void setEleveurEntity(EleveurEntity eleveurEntity) {
        this.eleveurEntity = eleveurEntity;
    }

    public List<BatimentEntity> getBatimentEntities() {
        return batimentEntities;
    }

    public void setBatimentEntities(List<BatimentEntity> batimentEntities) {
        this.batimentEntities = batimentEntities;
    }
}
