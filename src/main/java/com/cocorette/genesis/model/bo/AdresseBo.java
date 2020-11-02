package com.cocorette.genesis.model.bo;

public class AdresseBo {
    private String rue="XXXX";
    private int codePostal=99999;
    private String ville="XXXX";
    private String pays="France";

    public AdresseBo(){}

    public AdresseBo(String rue, int codePostal, String ville, String pays) {
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public AdresseBo(String rue, int codePostal, String ville) {
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
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

    @Override
    public String toString() {
        return rue + ", " +codePostal +
                " " + ville +
                ", " + pays ;
    }
}