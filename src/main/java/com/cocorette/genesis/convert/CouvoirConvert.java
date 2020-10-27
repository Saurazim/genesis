package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.CouvoirBo;
import com.cocorette.genesis.model.entity.CouvoirEntity;

public class CouvoirConvert {
    public static CouvoirBo couvoirEntityToBo(CouvoirEntity entity){
        return new CouvoirBo(entity.getId(), entity.getName());
    }

    public static CouvoirEntity couvoirBoToEntity(CouvoirBo bo){
        return new CouvoirEntity(bo.getId(), bo.getNom());
    }
}
