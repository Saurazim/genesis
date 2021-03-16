package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.ArriveeEauBo;
import com.cocorette.genesis.model.entity.ArriveeEauEntity;

public class ArriveeEauConvert {
    public static ArriveeEauBo arriveeEauEntityToBo(ArriveeEauEntity entity){
        ArriveeEauBo bo = new ArriveeEauBo();
        bo.setId(entity.getId());
        bo.setNom(entity.getNom());

        return bo;
    }

    public static ArriveeEauEntity arriveeEauBoToEntity(ArriveeEauBo bo){
        ArriveeEauEntity entity = new ArriveeEauEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getNom());

        return entity;
    }
}
