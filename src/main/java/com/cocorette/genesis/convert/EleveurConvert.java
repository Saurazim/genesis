package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.bo.EleveurBo;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.transitionnel.EleveurPo;
import com.cocorette.genesis.model.view.EleveurView;

public class EleveurConvert {
    public static EleveurBo eleveurEntityToBo(EleveurEntity entity){
        EleveurBo bo = new EleveurBo();
        bo.setId(entity.getId());
        bo.setPrenom(entity.getPrenom().isBlank() ? "": entity.getPrenom());
        bo.setNom(entity.getNom().isBlank() ? "": entity.getNom());
        if(entity.getContact()!=null)
            bo.setContactBo(ContactConvert.contactEntityToBo(entity.getContact()));

        return bo;
    }

    public static EleveurEntity eleveurBoToEntity(EleveurBo bo){
        EleveurEntity entity = new EleveurEntity();
        if(bo.getId()!=null)
            entity.setId(bo.getId());
        entity.setPrenom(bo.getPrenom().isBlank() ? "" : bo.getPrenom());
        entity.setNom(bo.getNom().isBlank() ? "" : bo.getNom());
        entity.setContact(ContactConvert.contactBoToEntity(bo.getContactBo()));

        return entity;
    }

    public static EleveurBo eleveurFormToBo(EleveurForm form){
        EleveurBo bo = new EleveurBo();
        bo.setPrenom(form.getPrenom().isBlank() ? "": form.getPrenom());
        bo.setNom(form.getNom().isBlank() ? "": form.getNom());
        bo.setContactBo(new ContactBo(form.getMail(),
                form.getTelFixe(),
                form.getTelPort(),
                form.getFax()));

        return bo;
    }

    public static EleveurEntity eleveurFormToEntity(EleveurForm form){
        EleveurBo bo = eleveurFormToBo(form);

        return eleveurBoToEntity(bo);
    }

    public static EleveurView eleveurBoToView(EleveurBo bo){
        EleveurView view = new EleveurView();
        view.setId(bo.getId());
        view.setNom(bo.getNom());
        view.setPrenom(bo.getPrenom());
        view.setMail(bo.getContactBo().getMail());
        view.setTelFixe(bo.getContactBo().getTelFixe());
        view.setTelPort(bo.getContactBo().getTelPort());
        view.setFax(bo.getContactBo().getFax());

        return view;
    }

    public static EleveurView eleveurEntityToView(EleveurEntity entity){
        EleveurBo bo = eleveurEntityToBo(entity);

        return eleveurBoToView(bo);
    }

    public static EleveurTable eleveurBoToTable(EleveurBo bo){
        EleveurTable table = new EleveurTable();
        table.setId(bo.getId());
        table.setPrenom(bo.getPrenom());
        table.setNom(bo.getNom());
        table.setEmail(bo.getContactBo().getMail());
        table.setTelFixe(bo.getContactBo().getTelFixe());
        table.setTelPort(bo.getContactBo().getTelPort());
        table.setFax(bo.getContactBo().getFax());

        return table;
    }

    public static EleveurTable eleveurEntityToTable(EleveurEntity entity){
        EleveurBo bo = eleveurEntityToBo(entity);

        return eleveurBoToTable(bo);
    }

    public static EleveurPo eleveurEntityToPo(EleveurEntity entity){
        EleveurPo po = new EleveurPo();
        po.setId(entity.getId());
        po.setNom(entity.getNom());
        po.setPrenom(entity.getPrenom());

        return po;
    }
}
