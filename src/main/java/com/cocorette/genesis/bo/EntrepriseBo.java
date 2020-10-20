package com.cocorette.genesis.bo;

import java.util.HashMap;

public class EntrepriseBo {
    private String ede;
    private CentreBo centreBo;
    private AdresseBo adresseBo;
    private ContactBo contactBo;
    private EleveurBo eleveurBo;


    public String getEde() {
        return ede;
    }

    public void setEde(String ede) {
        this.ede = ede;
    }

    public CentreBo getCentreBo() {
        return centreBo;
    }

    public void setCentreBo(CentreBo centreBo) {
        this.centreBo = centreBo;
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

    public EleveurBo getEleveurBo() {
        return eleveurBo;
    }

    public void setEleveurBo(EleveurBo eleveurBo) {
        this.eleveurBo = eleveurBo;
    }
}
