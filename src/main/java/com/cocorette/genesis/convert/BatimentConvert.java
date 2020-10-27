package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.bo.BatimentBo;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.transitionnel.BatimentPo;
import com.cocorette.genesis.model.view.BatimentView;

public class BatimentConvert {
    public static BatimentBo batimentEntityToBo(BatimentEntity entity){
        BatimentBo bo = new BatimentBo();
        bo.setId(entity.getId());
        bo.setInuav(entity.getInuav());
        bo.setAdresseBo(AdresseConvert.adresseEntityToBo(entity.getAdresse()));
        bo.setEntreprisePo(EntrepriseConvert.entrepriseEntityToPo(entity.getEntreprise()));
        bo.setDocCharte(entity.getDocCharte());
        bo.setAnneeCharte(entity.getAnneeCharte());
        bo.setEau(entity.getEau());
        bo.setDistCentre(entity.getDistCentre());
        bo.setContratDebut(entity.getContratDebut());
        bo.setContratFin(entity.getContratFin());
        bo.setCertifBioDebut(entity.getCertifBioDebut());
        bo.setCertifBioFin(entity.getCertifBioFin());
        bo.setAnneeDebut(entity.getAnneeDebut());
        bo.setGps(GpsConvert.gpsEntityToBo(entity.getGps()));
        bo.setCommentaires(entity.getCommentaires());
        bo.setActif(entity.isActif());
        bo.setArchive(entity.isArchive());
        bo.setCreated(entity.getCreated());
        bo.setModified(entity.getModified());

        return bo;
    }

    public static BatimentEntity batimentBoToEntity(BatimentBo bo){
        BatimentEntity entity = new BatimentEntity();
        entity.setId(bo.getId());
        entity.setInuav(bo.getInuav());
        entity.setAdresse(AdresseConvert.adresseBoToEntity(bo.getAdresseBo()));
        entity.setEntreprise(EntrepriseConvert.entreprisePoToEntity(bo.getEntreprisePo()));
        entity.setDocCharte(bo.getDocCharte());
        entity.setAnneeCharte(bo.getAnneeCharte());
        entity.setEau(bo.getEau());
        entity.setDistCentre(bo.getDistCentre());
        entity.setContratDebut(bo.getContratDebut());
        entity.setContratFin(bo.getContratFin());
        entity.setCertifBioDebut(bo.getCertifBioDebut());
        entity.setCertifBioFin(bo.getCertifBioFin());
        entity.setAnneeDebut(bo.getAnneeDebut());
        entity.setGps(GpsConvert.gpsBoToEntity(bo.getGps()));
        entity.setCommentaires(bo.getCommentaires());
        entity.setActif(bo.isActif());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());

        return entity;
    }

    public static BatimentBo batimentFormToBo(BatimentForm form){
        BatimentBo bo = new BatimentBo();
        bo.setInuav(form.getInuav());
        bo.setAdresseBo(new AdresseBo(form.getRue(), form.getCodePostal(), form.getVille(), form.getPays()));
        bo.setEntreprisePo(form.getEntrepriseId());
        bo.setDocCharte(form.getDocCharte());
        bo.setAnneeCharte(form.getAnneeCharte());
        bo.setEau(form.getEau());
        bo.setDistCentre(form.getDistCentre());
        bo.setContratDebut(form.getContratDebut());
        bo.setContratFin(form.getContratFin());
        bo.setCertifBioDebut(form.getCertifBioDebut());
        bo.setCertifBioFin(form.getCertifBioFin());
        bo.setAnneeDebut(form.getAnneeDebut());
        bo.setGps(form.getLatitude(), form.getLongitude());
        bo.setCommentaires(form.getCommentaires());
        bo.setCreated(form.getCreated());
        bo.setModified(form.getModified());

        return bo;
    }

    public static BatimentView batimentBoToView(BatimentBo bo){
        BatimentView view = new BatimentView();
        view.setId(bo.getId());
        view.setInuav(bo.getInuav());
        view.setEntreprise(bo.getEntreprisePo().getNom());
        view.setEntrepriseId(bo.getEntreprisePo().getId());
        view.setDocCharte(bo.getDocCharte());
        view.setContratDebut(bo.getContratDebut());
        view.setContratFin(bo.getContratFin());
        view.setCertifBioDebut(bo.getCertifBioDebut());
        view.setCertifBioFin(bo.getCertifBioFin());
        view.setRue(bo.getAdresseBo().getRue());
        view.setCodePostal(bo.getAdresseBo().getCodePostal());
        view.setVille(bo.getAdresseBo().getVille());
        view.setPays(bo.getAdresseBo().getPays());
        view.setCommentaire(bo.getCommentaires());
        view.setCreated(bo.getCreated());
        view.setModified(bo.getModified());
        view.setActif(bo.isActif());
        view.setArchive(bo.isArchive());

        return view;
    }

    public static BatimentView batimentEntityToView(BatimentEntity entity){
        BatimentBo bo = batimentEntityToBo(entity);

        return batimentBoToView(bo);
    }

    public static BatimentEntity batimentFormToEntity(BatimentForm form){
        BatimentBo bo = batimentFormToBo(form);

        return batimentBoToEntity(bo);
    }

    public static BatimentTable batimentBoToTable(BatimentBo bo){
        BatimentTable table = new BatimentTable();
        table.setId(bo.getId());
        table.setInuav(bo.getInuav());
        table.setAdresse(bo.getAdresseBo().toString());
        table.setEntrepriseId(bo.getEntreprisePo().getId());
        table.setEntrepriseNom(bo.getEntreprisePo().getNom());
        table.setActif(bo.isActif());
        table.setArchive(bo.isArchive());
        table.setCreated(bo.getCreated());
        table.setModified(bo.getModified());

        return table;
    }

    public static BatimentTable batimentEntityToTable(BatimentEntity entity){
        BatimentBo bo = batimentEntityToBo(entity);

        return batimentBoToTable(bo);
    }

    public static BatimentPo batimentEntityToPo(BatimentEntity entity){
        return new BatimentPo(entity.getId(), entity.getInuav());
    }

    public static BatimentEntity batimentPoToEntity(BatimentPo po){
        BatimentEntity entity = new BatimentEntity();
        entity.setId(po.getId());
        entity.setInuav(po.getInuav());

        return entity;
    }
}
