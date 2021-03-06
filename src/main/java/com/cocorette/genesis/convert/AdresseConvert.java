package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.entity.AdresseEntity;

public class AdresseConvert {
    public static AdresseEntity adresseBoToEntity(AdresseBo bo){
        AdresseEntity entity = new AdresseEntity();
        entity.setId(bo.getId());
        entity.setRue(bo.getRue());
        entity.setCodePostal(bo.getCodePostal());
        entity.setVille(bo.getVille());
        entity.setPays(bo.getPays());

        return entity;
    }

    public static AdresseBo adresseEntityToBo(AdresseEntity entity){
        AdresseBo bo = new AdresseBo();
        bo.setId(entity.getId());
        bo.setRue(entity.getRue());
        bo.setCodePostal(entity.getCodePostal());
        bo.setVille(entity.getVille());
        bo.setPays(entity.getPays());

        return bo;
    }
}
