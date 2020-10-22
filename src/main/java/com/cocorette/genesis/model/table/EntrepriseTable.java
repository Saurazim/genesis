package com.cocorette.genesis.model.table;

public class EntrepriseTable {
    private int id;
    private String ede;
    private String nom;
    private String eleveur;
    private String adresse;
    private String mail;
    private String telFixe;
    private String telPort;
    private String fax;
    private String veterinaire;
    private String centre;

    public EntrepriseTable(){}

    public EntrepriseTable(int id) {
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

    public String getEleveur() {
        return eleveur;
    }

    public void setEleveur(String eleveur) {
        this.eleveur = eleveur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getVeterinaire() {
        return veterinaire;
    }

    public void setVeterinaire(String veterinaire) {
        this.veterinaire = veterinaire;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }
}
