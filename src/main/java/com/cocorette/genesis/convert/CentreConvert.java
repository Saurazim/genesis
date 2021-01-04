package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.CentreBo;
import com.cocorette.genesis.model.entity.CentreEntity;

public class CentreConvert {
    public static CentreEntity centreBoToEntity(CentreBo bo){
        CentreEntity entity = new CentreEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getNom());
        entity.setLongitude(bo.getLongitude());
        entity.setLatitude(bo.getLatitude());

        return entity;
    }

    public static CentreBo centreEntityToBo(CentreEntity entity){
        CentreBo bo = new CentreBo();
        bo.setId(entity.getId());
        bo.setNom(entity.getNom());
        bo.setLongitude(entity.getLongitude());
        bo.setLatitude(entity.getLatitude());

        return bo;
    }
}
