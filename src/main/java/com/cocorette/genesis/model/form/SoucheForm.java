package com.cocorette.genesis.model.form;

public class SoucheForm {
    private String nom;
    private String commentaire;

    public SoucheForm(){}

    public SoucheForm(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
