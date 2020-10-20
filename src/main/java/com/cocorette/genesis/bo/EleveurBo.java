package com.cocorette.genesis.bo;



public class EleveurBo {
    private int id;
    private String prenom;
    private String nom;
    private AdresseBo adresseBo;
    private ContactBo contactBo;

    public EleveurBo(){}

    public EleveurBo(int id, String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
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

    public AdresseBo getAdresseBo() {
        return adresseBo;
    }

    public void setAdresseBo(AdresseBo adresseBo) {
        this.adresseBo = adresseBo;
    }

    public void setAdresseBo(String rue, int CP, String ville, String pays){
        this.adresseBo = new AdresseBo(rue,CP,ville,pays);
    }

    public ContactBo getContactBo() {
        return contactBo;
    }

    public void setContactBo(ContactBo contactBo) {
        this.contactBo = contactBo;
    }
}
