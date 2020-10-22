package com.cocorette.genesis.model.bo;

public class EntrepriseBo {
    private int id;
    private String name;
    private String ede;
    private CentreBo centreBo;
    private AdresseBo adresseBo;
    private ContactBo contactBo;
    private EleveurBo eleveurBo;
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

    public EleveurBo getEleveurBo() {
        return eleveurBo;
    }

    public void setEleveurBo(EleveurBo eleveurBo) {
        this.eleveurBo = eleveurBo;
    }

    public VeterinaireBo getVeterinaireBo() {
        return veterinaireBo;
    }

    public void setVeterinaireBo(VeterinaireBo veterinaireBo) {
        this.veterinaireBo = veterinaireBo;
    }
}
