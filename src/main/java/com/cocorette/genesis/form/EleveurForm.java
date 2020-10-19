package com.cocorette.genesis.form;

public class EleveurForm {
    private String prenom;
    private String nom;
    private String mail;
    private String telFixe;
    private String telPort;
    private String fax;
    private String rue;
    private int codePostal;
    private String ville;
    private String pays;
    private String adresse;

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

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setAdresse(){
        this.adresse = this.rue
                +", "+this.codePostal
                +" "+this.ville
                +", "+this.pays;
    }

    public void setAdresse(String rue, int codePostal, String ville, String pays){
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
        this.setAdresse();
    }

    public void setContact(String mail, String telFixe, String telPort, String fax){
        this.mail = mail;
        this.telFixe = telFixe;
        this.telPort = telPort;
        this.fax = fax;
    }
}
