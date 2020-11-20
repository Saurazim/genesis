package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.*;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.transitionnel.EleveurPo;
import com.cocorette.genesis.model.transitionnel.EntreprisePo;
import com.cocorette.genesis.model.view.EntrepriseView;

public class EntrepriseConvert {
    public static EntrepriseEntity entrepriseBoToEntity(EntrepriseBo bo){
        EntrepriseEntity entity = new EntrepriseEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getName());
        entity.setEde(bo.getEde());
        entity.setAdresse(AdresseConvert.adresseBoToEntity(bo.getAdresseBo()));
        if (bo.getContactBo()!=null)
            entity.setContact(ContactConvert.contactBoToEntity(bo.getContactBo()));
        if (bo.getCentreBo()!=null)
            entity.setCentre(CentreConvert.centreBoToEntity(bo.getCentreBo()));
        entity.setEleveur(new EleveurEntity(bo.getEleveurPo().getId()));
        entity.setCommentaires(bo.getCommentaires());
        entity.setActif(bo.isActif());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());

        return entity;
    }

    public static EntrepriseBo entrepriseEntityToBo(EntrepriseEntity entity){
        EntrepriseBo bo = new EntrepriseBo();
        bo.setId(entity.getId());
        bo.setName(entity.getNom());
        bo.setEde(entity.getEde());
        bo.setAdresseBo(AdresseConvert.adresseEntityToBo(entity.getAdresse()));
        if (entity.getContact()!=null)
        bo.setContactBo(ContactConvert.contactEntityToBo(entity.getContact()));
        if (entity.getCentre()!=null)
            bo.setCentreBo(CentreConvert.centreEntityToBo(entity.getCentre()));
        if(entity.getEleveur() != null)
           bo.setEleveurPo(EleveurConvert.eleveurEntityToPo(entity.getEleveur()));
        bo.setCommentaires(entity.getCommentaires());
        bo.setActif(entity.isActif());
        bo.setArchive(entity.isArchive());
        bo.setCreated(entity.getCreated());
        bo.setModified(entity.getModified());

        return bo;
    }

    public static EntrepriseBo entrepriseFormToBo(EntrepriseForm form){
        EntrepriseBo bo = new EntrepriseBo();
        bo.setName(form.getNom());
        bo.setEde(form.getEde());
        bo.setContactBo(new ContactBo(form.getMail(), form.getTelFixe(), form.getTelPort(), form.getFax()));
        bo.setEleveurPo(new EleveurPo(form.getEleveurId()));
        bo.setAdresseBo(new AdresseBo(form.getRue(), form.getCodePostal(), form.getVille(), form.getPays()));
        bo.setCommentaires(form.getCommentaires());
        bo.setCreated(form.getCreated());
        bo.setModified(form.getModified());

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
        if (bo.getContactBo()!=null){
            table.setMail(bo.getContactBo().getMail());
            table.setTelFixe(bo.getContactBo().getTelFixe());
            table.setTelPort(bo.getContactBo().getTelPort());
            table.setFax(bo.getContactBo().getFax());
        }
        if (bo.getCentreBo()!=null)
            table.setCentre(bo.getCentreBo().getName());
        table.setEleveurNom(bo.getEleveurPo().getNom()+" "+bo.getEleveurPo().getPrenom());
        if (bo.getVeterinaireBo()!=null)
            table.setVeterinaire(bo.getVeterinaireBo().getName());
        table.setActif(bo.isActif());
        table.setArchive(bo.isArchive());
        table.setCreated(bo.getCreated());
        table.setModified(bo.getModified());

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
        if (bo.getContactBo()!=null){
            view.setMail(bo.getContactBo().getMail());
            view.setTelFixe(bo.getContactBo().getTelFixe());
            view.setTelPort(bo.getContactBo().getTelPort());
            view.setFax(bo.getContactBo().getFax());
        }
        view.setEleveur(bo.getEleveurPo().getNom()+" "+bo.getEleveurPo().getPrenom());
        view.setEleveurId(bo.getEleveurPo().getId());
        if (bo.getCentreBo()!=null){
            view.setCentre(bo.getCentreBo().getName());
            view.setCentreId(bo.getCentreBo().getId());
        }
        if (bo.getVeterinaireBo()!=null) {
            view.setVeterinaire(bo.getVeterinaireBo().getName());
            view.setVeterinaireId(bo.getVeterinaireBo().getId());
        }
        view.setCommentaire(bo.getCommentaires());
        view.setCreated(bo.getCreated());
        view.setModified(bo.getModified());
        view.setActif(bo.isActif());
        view.setArchive(bo.isArchive());

        return view;
    }

    public static EntrepriseView entrepriseEntityToView(EntrepriseEntity entity){
        EntrepriseBo bo = entrepriseEntityToBo(entity);

        return entrepriseBoToView(bo);
    }

    public static EntreprisePo entrepriseEntityToPo(EntrepriseEntity entity){
        EntreprisePo po = new EntreprisePo();
        po.setId(entity.getId());
        po.setEde(entity.getEde());
        po.setNom(entity.getNom());

        return po;
    }

    public static EntrepriseEntity entreprisePoToEntity(EntreprisePo po){
        return new EntrepriseEntity(po.getId());
    }
}
