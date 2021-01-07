package com.cocorette.genesis.model;

import com.cocorette.genesis.configuration.ConstantesForTest;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.entity.GpsEntity;

public class GpsTest {
    private static final int ID = ConstantesForTest.ID;
    private static final float LATITUDE = ConstantesForTest.LATITUDE;
    private static final float LONGITUDE = ConstantesForTest.LONGITUDE;

    public GpsEntity creerEntity(){
        GpsEntity entity = new GpsEntity();

        entity.setId(ID);
        entity.setLatitude(LATITUDE);
        entity.setLongitude(LONGITUDE);

        return entity;
    }

    public GpsBo creerBo(){
        GpsBo bo = new GpsBo();

        bo.setId(ID);
        bo.setLatitude(LATITUDE);
        bo.setLongitude(LONGITUDE);

        return bo;
    }
}
