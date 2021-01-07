package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.AdresseBo;
import com.cocorette.genesis.model.entity.AdresseEntity;

public class AdresseTest {
    private int ID = ConstantesForTest.ID;
    private String RUE = ConstantesForTest.RUE;
    private String CP = ConstantesForTest.CP;
    private String VILLE = ConstantesForTest.VILLE;
    private String PAYS = ConstantesForTest.PAYS;

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
