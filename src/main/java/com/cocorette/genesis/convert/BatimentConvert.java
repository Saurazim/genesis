package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.BatimentBo;
import com.cocorette.genesis.model.entity.BatimentEntity;

public class BatimentConvert {
    public static BatimentBo batimentEntityToBo(BatimentEntity entity){
        BatimentBo bo = new BatimentBo();
        bo.setId(entity.getId());
        bo.setInuav(entity.getInuav());
        bo.setAdresseBo(AdresseConvert.adresseEntityToBo(entity.getAdresse()));
        bo.setEntrepriseBo(EntrepriseConvert.entrepriseEntityToBo(entity.getEntreprise()));
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
        entity.setEntreprise(EntrepriseConvert.entrepriseBoToEntity(bo.getEntrepriseBo()));
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
}
