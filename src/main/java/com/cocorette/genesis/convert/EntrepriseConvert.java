package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.*;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.view.EntrepriseView;

public class EntrepriseConvert {
    public static EntrepriseEntity entrepriseBoToEntity(EntrepriseBo bo){
        EntrepriseEntity entity = new EntrepriseEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getName());
        entity.setEde(bo.getEde());
        entity.setAdresse(AdresseConvert.adresseBoToEntity(bo.getAdresseBo()));
        entity.setContact(ContactConvert.contactBoToEntity(bo.getContactBo()));
        entity.setCentre(CentreConvert.centreBoToEntity(bo.getCentreBo()));
        entity.setEleveur(EleveurConvert.eleveurBoToEntity(bo.getEleveurBo()));

        return entity;
    }

    public static EntrepriseBo entrepriseEntityToBo(EntrepriseEntity entity){
        EntrepriseBo bo = new EntrepriseBo();
        bo.setId(entity.getId());
        bo.setName(entity.getNom());
        bo.setEde(entity.getEde());
        bo.setAdresseBo(AdresseConvert.adresseEntityToBo(entity.getAdresse()));
        bo.setContactBo(ContactConvert.contactEntityToBo(entity.getContact()));
        bo.setCentreBo(CentreConvert.centreEntityToBo(entity.getCentre()));
        if(entity.getEleveur() != null)
            bo.setEleveurBo(EleveurConvert.eleveurEntityToBo(entity.getEleveur()));

        return bo;
    }

    public static EntrepriseBo entrepriseFormToBo(EntrepriseForm form){
        EntrepriseBo bo = new EntrepriseBo();
        bo.setName(form.getNom());
        bo.setEde(form.getEde());
        bo.setContactBo(new ContactBo(form.getMail(), form.getTelFixe(), form.getTelPort(), form.getFax()));
        bo.setEleveurBo(new EleveurBo(form.getEleveurId()));
        bo.setAdresseBo(new AdresseBo(form.getRue(), form.getCodePostal(), form.getVille(), form.getPays()));

        return bo;
    }

    public static EntrepriseEntity entrepriseFormToEntity(EntrepriseForm form){
        EntrepriseBo bo = entrepriseFormToBo(form);

        return entrepriseBoToEntity(bo);
    }

    public static EntrepriseTable entrepriseBoToTable(EntrepriseBo bo){
        EntrepriseTable table = new EntrepriseTable();
        table.setId(bo.getId());
        table.setNom(bo.getName());
        table.setEde(bo.getEde());
        table.setAdresse(bo.getAdresseBo().toString());
        table.setMail(bo.getContactBo().getMail());
        table.setTelFixe(bo.getContactBo().getTelFixe());
        table.setTelPort(bo.getContactBo().getTelPort());
        table.setFax(bo.getContactBo().getFax());
        table.setCentre(bo.getCentreBo().getName());
        table.setEleveur(bo.getEleveurBo().getNom()+" "+bo.getEleveurBo().getPrenom());
        table.setVeterinaire(bo.getVeterinaireBo().getName());

        return table;
    }

    public static EntrepriseTable entrepriseEntityToTable(EntrepriseEntity entity){
        EntrepriseBo bo = entrepriseEntityToBo(entity);

        return entrepriseBoToTable(bo);
    }

    public static EntrepriseView entrepriseBoToView(EntrepriseBo bo){
        EntrepriseView view = new EntrepriseView();
        view.setId(bo.getId());
        view.setNom(bo.getName());
        view.setEde(bo.getEde());
        view.setRue(bo.getAdresseBo().getRue());
        view.setCodePostal(bo.getAdresseBo().getCodePostal());
        view.setVille(bo.getAdresseBo().getVille());
        view.setPays(bo.getAdresseBo().getPays());
        view.setMail(bo.getContactBo().getMail());
        view.setTelFixe(bo.getContactBo().getTelFixe());
        view.setTelPort(bo.getContactBo().getTelPort());
        view.setFax(bo.getContactBo().getFax());
        view.setEleveur(bo.getEleveurBo().getNom()+" "+bo.getEleveurBo().getPrenom());
        view.setCentre(bo.getCentreBo().getName());
        view.setVeterinaire(bo.getVeterinaireBo().getName());

        return view;
    }

    public static EntrepriseView entrepriseEntityToView(EntrepriseEntity entity){
        EntrepriseBo bo = entrepriseEntityToBo(entity);

        return entrepriseBoToView(bo);
    }
}
