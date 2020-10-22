package com.cocorette.genesis.model.bo;



public class EleveurBo {
    private Integer id;
    private String prenom;
    private String nom;
    private ContactBo contactBo;

    public EleveurBo(){}

    public EleveurBo(int id){
        this.id=id;
    }

    public EleveurBo(int id, String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public ContactBo getContactBo() {
        return contactBo;
    }

    public void setContactBo(ContactBo contactBo) {
        this.contactBo = contactBo;
    }
}
