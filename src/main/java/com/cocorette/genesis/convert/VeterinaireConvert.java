package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.VeterinaireBo;
import com.cocorette.genesis.model.entity.VeterinaireEntity;

public class VeterinaireConvert {
    public VeterinaireBo veterinaireEntityToBo(VeterinaireEntity entity){
        VeterinaireBo bo = new VeterinaireBo();
        bo.setName(entity.getNom());
        bo.setLongitude(entity.getLongitude());
        bo.setLatitude(entity.getLatitude());

        return bo;
    }

    public VeterinaireEntity veterinaireBoToEntity(VeterinaireBo bo){
        VeterinaireEntity entity = new VeterinaireEntity();
        entity.setNom(bo.getName());
        entity.setLongitude(bo.getLongitude());
        entity.setLatitude(bo.getLatitude());

        return entity;
    }
}
