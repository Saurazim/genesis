package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.VeterinaireBo;
import com.cocorette.genesis.model.entity.VeterinaireEntity;

public class VeterinaireConvert {
    public static VeterinaireBo veterinaireEntityToBo(VeterinaireEntity entity){
        VeterinaireBo bo = new VeterinaireBo();
        bo.setId(entity.getId());
        bo.setNom(entity.getNom());
        bo.setGpsBo(GpsConvert.gpsEntityToBo(entity.getGps()));
        bo.setCommentaire(entity.getCommentaire());
        bo.setActive(entity.isActive());
        bo.setArchive(entity.isArchive());
        bo.setCreated(entity.getCreated());
        bo.setModified(entity.getModified());

        return bo;
    }

    public static VeterinaireEntity veterinaireBoToEntity(VeterinaireBo bo){
        VeterinaireEntity entity = new VeterinaireEntity();
        entity.setNom(bo.getNom());
        entity.setGps(GpsConvert.gpsBoToEntity(bo.getGpsBo()));
        entity.setCommentaire(bo.getCommentaire());
        entity.setActive(bo.isActive());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());

        return entity;
    }
}
