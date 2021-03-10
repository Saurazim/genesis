package com.cocorette.genesis.service;

import com.cocorette.genesis.dao.GpsDao;
import com.cocorette.genesis.model.bo.BatimentBo;
import com.cocorette.genesis.model.bo.GpsBo;
import com.cocorette.genesis.model.entity.GpsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GpsService {
    @Autowired
    GpsDao gpsDao;

    public Optional<GpsEntity> findOne(int id){
        return gpsDao.findById(id);
    }

    public void saveGps(GpsEntity entity){
        gpsDao.save(entity);
    }
}
