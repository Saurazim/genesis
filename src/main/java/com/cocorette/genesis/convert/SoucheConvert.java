package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.SoucheBo;
import com.cocorette.genesis.model.entity.SoucheEntity;

public class SoucheConvert {
    public static SoucheBo soucheEntityToBo(SoucheEntity entity){
        return new SoucheBo(entity.getId(), entity.getNom());
    }

    public static SoucheEntity soucheBoToEntity(SoucheBo bo){
        return new SoucheEntity(bo.getId(), bo.getNom());
    }
}
