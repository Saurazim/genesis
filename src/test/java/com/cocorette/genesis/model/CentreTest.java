package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.CentreBo;
import com.cocorette.genesis.model.entity.CentreEntity;

public class CentreTest {
    private static final int ID = ConstantesForTest.ID;
    private static final String NOM = ConstantesForTest.NOM_CENTRE;
    private static final float LONGITUDE = ConstantesForTest.LONGITUDE;
    private static final float LATITUDE = ConstantesForTest.LATITUDE;

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
