package com.cocorette.genesis.model;

import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.entity.AdresseEntity;

public class AdresseTest {
    private String RUE = "25 rue TrucMuche";
    private String CP = "56 123";
    private String VILLE = "Trifouillis les Oies";
    private String PAYS = "France";

    public AdresseBo creerBo(){
        AdresseBo bo = new AdresseBo();
        bo.setRue(RUE);
        bo.setCodePostal(CP);
        bo.setVille(VILLE);
        bo.setPays(PAYS);

        return bo;
    }

    public AdresseEntity creerEntity(){
        AdresseEntity entity = new AdresseEntity();
        entity.setRue(RUE);
        entity.setCodePostal(CP);
        entity.setVille(VILLE);
        entity.setPays(PAYS);

        return entity;
    }
}
