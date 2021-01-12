package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.bo.BatimentBo;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.transitionnel.BatimentPo;
import com.cocorette.genesis.model.transitionnel.EntreprisePo;
import com.cocorette.genesis.model.view.BatimentView;

public class BatimentConvert {
    public static BatimentBo batimentEntityToBo(BatimentEntity entity){
        BatimentBo bo = new BatimentBo();
        bo.setId(entity.getId());
        bo.setInuav(entity.getInuav());
        bo.setAdresseBo(AdresseConvert.adresseEntityToBo(entity.getAdresse()));
        bo.setEntreprisePo(EntrepriseConvert.entrepriseEntityToPo(entity.getEntreprise()));
        bo.setEau(entity.getEau());
        bo.setDistCentre(entity.getDistCentre());
        bo.setAnneeDebut(entity.getAnneeDebut());
        bo.setGps(GpsConvert.gpsEntityToBo(entity.getGps()));
        bo.setTypeBatiment(entity.getTypeBatiment());
        bo.setNbArbres(entity.getNbArbres());
        bo.setTypeArbres(entity.getTypeArbres());
        bo.setCommentaire(entity.getCommentaire());
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
        entity.setEau(bo.getEau());
        entity.setDistCentre(bo.getDistCentre());
        entity.setAnneeDebut(bo.getAnneeDebut());
        entity.setGps(GpsConvert.gpsBoToEntity(bo.getGps()));
        entity.setTypeBatiment(bo.getTypeBatiment());
        entity.setNbArbres(bo.getNbArbres());
        entity.setTypeArbres(bo.getTypeArbres());
        entity.setCommentaire(bo.getCommentaire());
        entity.setActif(bo.isActif());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());

        return entity;
    }

    public static BatimentBo batimentFormToBo(BatimentForm form){
        BatimentBo bo = new BatimentBo();
        bo.setInuav(form.getInuav());
        bo.setEntreprisePo(new EntreprisePo(form.getEntrepriseId()));
        bo.setEau(form.getEau());
        bo.setDistCentre(form.getDistCentre());
        bo.setAnneeDebut(form.getAnneeDebut());
        bo.setGps(new GpsBo(form.getLatitude(), form.getLongitude()));
        bo.setTypeBatiment(form.getTypeBatiment());
        bo.setNbArbres(form.getNbArbres());
        bo.setTypeArbres(form.getTypeArbres());
        bo.setCommentaire(form.getCommentaire());
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
        view.setRue(bo.getAdresseBo().getRue());
        view.setCodePostal(bo.getAdresseBo().getCodePostal());
        view.setVille(bo.getAdresseBo().getVille());
        view.setPays(bo.getAdresseBo().getPays());
        view.setEau(bo.getEau());
        view.setDistCentre(bo.getDistCentre());
        view.setAnneeDebut(bo.getAnneeDebut());
        view.setTypeBatiment(bo.getTypeBatiment());
        view.setNbArbres(bo.getNbArbres());
        view.setTypeArbres(bo.getTypeArbres());
        view.setCommentaire(bo.getCommentaire());
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
