package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.ContactBo;
import com.cocorette.genesis.model.bo.EleveurBo;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.modif.EleveurModif;
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
        bo.setCommentaire(entity.getCommentaire());
        bo.setActif(entity.isActif());
        bo.setArchive(entity.isArchive());
        bo.setCreated(entity.getCreated());
        bo.setModified(entity.getModified());

        return bo;
    }

    public static EleveurEntity eleveurBoToEntity(EleveurBo bo){
        EleveurEntity entity = new EleveurEntity();
        if(bo.getId()!=null)
            entity.setId(bo.getId());
        entity.setPrenom(bo.getPrenom().isBlank() ? "" : bo.getPrenom());
        entity.setNom(bo.getNom().isBlank() ? "" : bo.getNom());
        entity.setContact(ContactConvert.contactBoToEntity(bo.getContactBo()));
        entity.setCommentaire(bo.getCommentaire());
        entity.setActif(bo.isActif());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());

        return entity;
    }

    public static EleveurBo eleveurFormToBo(EleveurForm form){
        EleveurBo bo = new EleveurBo();

        ContactBo contact = new ContactBo();
        contact.setMail(form.getMail());
        contact.setTelFixe(form.getTelFixe());
        contact.setTelPort(form.getTelPort());
        contact.setFax(form.getFax());

        bo.setPrenom(form.getPrenom().isBlank() ? "": form.getPrenom());
        bo.setNom(form.getNom().isBlank() ? "": form.getNom());
        bo.setContactBo(contact);
        bo.setCommentaire(form.getCommentaire());
        bo.setCreated(form.getCreated());
        bo.setModified(form.getModified());

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
        view.setCommentaire(bo.getCommentaire());
        view.setCreated(bo.getCreated());
        view.setModified(bo.getModified());
        view.setActif(bo.isActif());
        view.setArchive(bo.isArchive());

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
        table.setMail(bo.getContactBo().getMail());
        table.setTelFixe(bo.getContactBo().getTelFixe());
        table.setTelPort(bo.getContactBo().getTelPort());
        table.setFax(bo.getContactBo().getFax());
        table.setActif(bo.isActif());
        table.setArchive(bo.isArchive());
        table.setCreated(bo.getCreated());
        table.setModified(bo.getModified());

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

    public static EleveurModif eleveurBoToModif(EleveurBo bo){
        EleveurModif modif = new EleveurModif();
        modif.setId(bo.getId());
        modif.setPrenom(bo.getPrenom());
        modif.setNom(bo.getNom());
        modif.setMail(bo.getContactBo().getMail());
        modif.setTelFixe(bo.getContactBo().getTelFixe());
        modif.setTelPort(bo.getContactBo().getTelPort());
        modif.setFax(bo.getContactBo().getFax());
        modif.setCommentaire(bo.getCommentaire());

        return modif;
    }

    public static EleveurBo eleveurModifToBo(EleveurModif modif){
        EleveurBo bo = new EleveurBo();
        ContactBo contactBo = new ContactBo();

        bo.setId(modif.getId());
        bo.setPrenom(modif.getPrenom());
        bo.setNom(modif.getNom());
        bo.setContactBo(contactBo);
        bo.getContactBo().setMail(modif.getMail());
        bo.getContactBo().setTelFixe(modif.getTelFixe());
        bo.getContactBo().setTelPort(modif.getTelPort());
        bo.getContactBo().setFax(modif.getFax());
        bo.setCommentaire(modif.getCommentaire());

        return bo;
    }

    public static EleveurEntity eleveurModifToEntity(EleveurModif modif){
        EleveurBo bo = eleveurModifToBo(modif);

        return eleveurBoToEntity(bo);
    }
}
