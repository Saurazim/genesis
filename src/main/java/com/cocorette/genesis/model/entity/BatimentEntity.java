package com.cocorette.genesis.model.entity;

public class BatimentEntity {
    private int id;
    private String inuav;
    private AdresseEntity adresseEntity;
    private EntrepriseEntity entrepriseEntity;

    public BatimentEntity(){}

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

    public AdresseEntity getAdresseEntity() {
        return adresseEntity;
    }

    public void setAdresseEntity(AdresseEntity adresseEntity) {
        this.adresseEntity = adresseEntity;
    }

    public EntrepriseEntity getEntrepriseEntity() {
        return entrepriseEntity;
    }

    public void setEntrepriseEntity(EntrepriseEntity entrepriseEntity) {
        this.entrepriseEntity = entrepriseEntity;
    }
}
