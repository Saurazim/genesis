package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.CategorieBo;
import com.cocorette.genesis.model.entity.CategorieEntity;

public class CategorieConvert {
    public static CategorieBo categorieEntityToBo(CategorieEntity entity){
        return new CategorieBo(entity.getId(), entity.getNom());
    }

    public static CategorieEntity categorieBoToEntity(CategorieBo bo){
        return new CategorieEntity(bo.getId(), bo.getNom());
    }
}
