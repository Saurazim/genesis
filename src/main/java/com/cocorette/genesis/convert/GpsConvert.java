package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.entity.GpsEntity;

public class GpsConvert {
    public static GpsBo gpsEntityToBo(GpsEntity entity){
        GpsBo bo = new GpsBo();
        bo.setId(entity.getId());
        bo.setLatitude(entity.getLatitude());
        bo.setLongitude(entity.getLongitude());

        return bo;
    }

    public static GpsEntity gpsBoToEntity(GpsBo bo){
        GpsEntity entity = new GpsEntity();
        entity.setId(bo.getId());
        entity.setLatitude(bo.getLatitude());
        entity.setLongitude(bo.getLongitude());

        return entity;
    }
}
