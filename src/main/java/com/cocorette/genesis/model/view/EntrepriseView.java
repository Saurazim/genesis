package com.cocorette.genesis.model.view;

import java.time.LocalDateTime;

public class EntrepriseView {
    private int id;
    private String nom;
    private String ede;
    private String mail;
    private String telFixe;
    private String telPort;
    private String fax;
    private String rue;
    private String codePostal;
    private String ville;
    private String pays;
    private String eleveur;
    private int eleveurId;
    private String veterinaire;
    private int veterinaireId;
    private String centre;
    private int centreId;
    private String commentaire;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean actif;
    private boolean archive;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEde() {
        return ede;
    }

    public void setEde(String ede) {
        this.ede = ede;
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

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
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

    public String getEleveur() {
        return eleveur;
    }

    public void setEleveur(String eleveur) {
        this.eleveur = eleveur;
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

    public int getEleveurId() {
        return eleveurId;
    }

    public void setEleveurId(int eleveurId) {
        this.eleveurId = eleveurId;
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

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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
}
