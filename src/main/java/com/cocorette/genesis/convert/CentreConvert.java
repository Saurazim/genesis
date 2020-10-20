package com.cocorette.genesis.convert;

import com.cocorette.genesis.bo.CentreBo;
import com.cocorette.genesis.model.CentreEntity;

public class CentreConvert {
    public static CentreEntity centreBoToEntity(CentreBo bo){
        CentreEntity entity = new CentreEntity();
        entity.setId(bo.getId());
        entity.setName(bo.getName());
        entity.setLongitude(bo.getLongitude());
        entity.setLatitude(bo.getLatitude());

        return entity;
    }

    public static CentreBo centreEntityToBo(CentreEntity entity){
        CentreBo bo = new CentreBo();
        bo.setId(entity.getId());
        bo.setName(entity.getName());
        bo.setLongitude(entity.getLongitude());
        bo.setLatitude(entity.getLatitude());

        return bo;
    }
}
