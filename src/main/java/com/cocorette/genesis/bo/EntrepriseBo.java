package com.cocorette.genesis.bo;

import java.util.HashMap;

public class EntrepriseBo {
    private String ede;
    private int veterinaireId;
    private int centreId;
    private AdresseBo adresseBo;
    private ContactBo contactBo;
    private HashMap<Integer,String> Eleveur;
    private HashMap<Integer,String> Batiments;

    public String getEde() {
        return ede;
    }

    public void setEde(String ede) {
        this.ede = ede;
    }

    public int getVeterinaireId() {
        return veterinaireId;
    }

    public void setVeterinaireId(int veterinaireId) {
        this.veterinaireId = veterinaireId;
    }

    public int getCentreId() {
        return centreId;
    }

    public void setCentreId(int centreId) {
        this.centreId = centreId;
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

    public HashMap<Integer, String> getEleveur() {
        return Eleveur;
    }

    public void setEleveur(HashMap<Integer, String> eleveur) {
        Eleveur = eleveur;
    }

    public HashMap<Integer, String> getBatiments() {
        return Batiments;
    }

    public void setBatiments(HashMap<Integer, String> batiments) {
        Batiments = batiments;
    }
}
