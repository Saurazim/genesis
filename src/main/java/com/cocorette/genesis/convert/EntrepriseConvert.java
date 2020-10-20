package com.cocorette.genesis.convert;

import com.cocorette.genesis.bo.*;
import com.cocorette.genesis.form.EntrepriseForm;
import com.cocorette.genesis.model.EntrepriseEntity;

import java.util.HashMap;

public class EntrepriseConvert {
    public static EntrepriseBo entrepriseFormToBo(EntrepriseForm form){
        EntrepriseBo bo = new EntrepriseBo();
               bo.setEde(form.getEde());
        bo.setAdresseBo(new AdresseBo(form.getRue(),
                form.getCodePostal(),
                form.getVille(),
                form.getPays()));
        bo.setCentreBo(new CentreBo(form.getCentreId(), form.getCentreNom()));
        bo.setContactBo(new ContactBo(form.getMail(),
                form.getTelFixe(),
                form.getTelPort(),
                form.getFax()));
        bo.setEleveurBo(new EleveurBo(form.getEleveurId(),
                form.getEleveurPrenom(),
                form.getEleveurNom()));

        return bo;
    }

    public static EntrepriseEntity entrepriseBoToEntity(EntrepriseBo bo){
        EntrepriseEntity entity = new EntrepriseEntity();
        entity.setEde(bo.getEde());
        entity.setAdresseEntity(AdresseConvert.adresseBoToEntity(bo.getAdresseBo()));
        entity.setContactEntity(ContactConvert.contactBoToEntity(bo.getContactBo()));
        entity.setCentreEntity(CentreConvert.centreBoToEntity(bo.getCentreBo()));
        entity.setEleveurEntity(EleveurConvert.eleveurBoToEntity(bo.getEleveurBo()));

        return entity;
    }
}
