package com.cocorette.genesis.convert;

import com.cocorette.genesis.bo.ContactBo;
import com.cocorette.genesis.bo.EleveurBo;
import com.cocorette.genesis.form.EleveurForm;
import com.cocorette.genesis.model.EleveurEntity;

public class EleveurConvert {
    public static EleveurBo eleveurEntityToBo(EleveurEntity entity){
        EleveurBo bo = new EleveurBo();
        bo.setPrenom(entity.getPrenom().isBlank() ? "": entity.getPrenom());
        bo.setNom(entity.getNom().isBlank() ? "": entity.getNom());
        if(entity.getAdresseEntity() !=null)
            bo.setAdresseBo(AdresseConvert.adresseEntityToBo(entity.getAdresseEntity()));
        if(entity.getContactEntity()!=null)
            bo.setContactBo(ContactConvert.contactEntityToBo(entity.getContactEntity()));

        return bo;
    }

    public static EleveurForm eleveurBoToForm(EleveurBo bo){
        EleveurForm form = new EleveurForm();
        form.setPrenom(bo.getPrenom().isBlank() ? "": bo.getPrenom());
        form.setNom(bo.getNom().isBlank() ? "": bo.getNom());
        form.setAdresse(bo.getAdresseBo().getRue(),
                bo.getAdresseBo().getCodePostal(),
                bo.getAdresseBo().getVille(),
                bo.getAdresseBo().getPays());
        form.setContact(bo.getContactBo().getMail(),
                bo.getContactBo().getTelFixe(),
                bo.getContactBo().getTelPort(),
                bo.getContactBo().getFax());

        return form;
    }

    public static EleveurBo eleveurFormToBo(EleveurForm form){
        EleveurBo bo = new EleveurBo();
        bo.setPrenom(form.getPrenom().isBlank() ? "": form.getPrenom());
        bo.setNom(form.getNom().isBlank() ? "": form.getNom());
        bo.setAdresseBo(form.getRue(),
                form.getCodePostal(),
                form.getVille(),
                form.getPays());
        bo.setContactBo(new ContactBo(form.getMail(),
                form.getTelFixe(),
                form.getTelPort(),
                form.getFax()));

        return bo;
    }

    public static EleveurEntity eleveurBoToEntity(EleveurBo bo){
        EleveurEntity entity = new EleveurEntity();
        entity.setPrenom(bo.getPrenom().isBlank() ? "" : bo.getPrenom());
        entity.setNom(bo.getNom().isBlank() ? "" : bo.getNom());
        entity.setAdresseEntity(AdresseConvert.adresseBoToEntity(bo.getAdresseBo()));
        entity.setContactEntity(ContactConvert.contactBoToEntity(bo.getContactBo()));

        return entity;
    }

    public static EleveurEntity eleveurFormToEntity(EleveurForm form){
        EleveurBo bo = eleveurFormToBo(form);

        return eleveurBoToEntity(bo);
    }

    public static EleveurForm eleveurEntityToForm(EleveurEntity entity){
        EleveurBo bo = eleveurEntityToBo(entity);

        return eleveurBoToForm(bo);
    }
}
