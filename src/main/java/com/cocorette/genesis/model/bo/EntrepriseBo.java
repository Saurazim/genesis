package com.cocorette.genesis.model.bo;

import com.cocorette.genesis.model.transitionnel.EleveurPo;

public class EntrepriseBo {
    private int id;
    private String name;
    private String ede;
    private CentreBo centreBo;
    private AdresseBo adresseBo;
    private ContactBo contactBo;
    private EleveurPo eleveurPo;

    private VeterinaireBo veterinaireBo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public EleveurPo getEleveurPo() {
        return eleveurPo;
    }

    public void setEleveurPo(EleveurPo eleveurPo) {
        this.eleveurPo = eleveurPo;
    }

    public void setEleveurPo(int id){
        this.eleveurPo.setId(id);
    }

    public VeterinaireBo getVeterinaireBo() {
        return veterinaireBo;
    }

    public void setVeterinaireBo(VeterinaireBo veterinaireBo) {
        this.veterinaireBo = veterinaireBo;
    }
}
