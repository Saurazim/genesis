package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.BatimentConvert;
import com.cocorette.genesis.dao.BatimentDao;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.view.BatimentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BatimentService {
    @Autowired
    BatimentDao batimentDao;

    public BatimentView findBatimentView(int id){
        Optional<BatimentEntity> batiment = batimentDao.findById(id);

        return BatimentConvert.batimentEntityToView(batiment.orElse(new BatimentEntity()));
    }


}
