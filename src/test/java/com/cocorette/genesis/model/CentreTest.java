package com.cocorette.genesis.model;

import com.cocorette.genesis.model.bo.CentreBo;
import com.cocorette.genesis.model.entity.CentreEntity;

public class CentreTest {
    private static final int ID = 12;
    private static final String NOM = "Doullens";
    private static final float LONGITUDE = 45654;
    private static final float LATITUDE = 12355;
    public CentreEntity creerEntity(){

        CentreEntity entity = new CentreEntity();
        entity.setId(ID);
        entity.setNom(NOM);
        entity.setLongitude(LONGITUDE);
        entity.setLatitude(LATITUDE);

        return entity;
    }

    public CentreBo creerBo(){

        CentreBo bo = new CentreBo();
        bo.setId(ID);
        bo.setNom(NOM);
        bo.setLongitude(LONGITUDE);
        bo.setLatitude(LATITUDE);

        return bo;
    }
}
