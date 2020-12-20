package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.CouvoirConvert;
import com.cocorette.genesis.dao.CouvoirDao;
import com.cocorette.genesis.model.entity.CouvoirEntity;
import com.cocorette.genesis.model.table.CouvoirTable;
import com.cocorette.genesis.model.view.CouvoirView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CouvoirService {
    @Autowired
    CouvoirDao couvoirDao;

    public List<CouvoirTable> findAll(){
        List<CouvoirEntity> entities = couvoirDao.findAll();
        List<CouvoirTable> tables = new ArrayList<>();
        for (CouvoirEntity entity: entities){
            CouvoirTable table = CouvoirConvert.couvoirEntityToTable(entity);
            tables.add(table);
        }
        return tables;
    }

    public CouvoirEntity saveCouvoir(CouvoirEntity entity){
        return couvoirDao.save(entity);
    }

    public Optional<CouvoirEntity> findById(int id){
        return couvoirDao.findById(id);
    }

    public CouvoirView findCouvoirView(int id){
        Optional<CouvoirEntity> couvoir = couvoirDao.findById(id);

        return CouvoirConvert.couvoirEntityToView(couvoir.orElse(new CouvoirEntity()));
    }
}
