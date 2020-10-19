package com.cocorette.genesis.convert;

import com.cocorette.genesis.bo.AdresseBo;
import com.cocorette.genesis.model.AdresseEntity;

public class AdresseConvert {
    public static AdresseEntity adresseBoToEntity(AdresseBo bo){
        AdresseEntity entity = new AdresseEntity();
        entity.setRue(bo.getRue());
        entity.setCodePostal(bo.getCodePostal());
        entity.setVille(bo.getVille());
        entity.setPays(bo.getPays());

        return entity;
    }

    public static AdresseBo adresseEntityToBo(AdresseEntity entity){
        AdresseBo bo = new AdresseBo();
        bo.setRue(entity.getRue());
        bo.setCodePostal(entity.getCodePostal());
        bo.setVille(entity.getVille());
        bo.setPays(entity.getPays());

        return bo;
    }
}
