package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.AlimentBo;
import com.cocorette.genesis.model.entity.AlimentEntity;

public class AlimentConvert {
    public static AlimentBo alimentEntityToBo(AlimentEntity entity){
        return new AlimentBo(entity.getId(), entity.getNom());
    }

    public static AlimentEntity alimentBoToEntity(AlimentBo bo){
        return new AlimentEntity(bo.getId(), bo.getNom());
    }
}
