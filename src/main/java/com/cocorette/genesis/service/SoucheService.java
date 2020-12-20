package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.SoucheConvert;
import com.cocorette.genesis.dao.SoucheDao;
import com.cocorette.genesis.model.entity.SoucheEntity;
import com.cocorette.genesis.model.table.SoucheTable;
import com.cocorette.genesis.model.view.SoucheView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SoucheService {
    @Autowired
    SoucheDao soucheDao;

    public List<SoucheTable> findAll(){
        List<SoucheEntity> entities = soucheDao.findAll();
        List<SoucheTable> tables = new ArrayList<>();
        for (SoucheEntity entity: entities){
            SoucheTable table = SoucheConvert.soucheEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }

    public SoucheEntity saveSouche(SoucheEntity entity){
        return soucheDao.save(entity);
    }

    public Optional<SoucheEntity> findById(int id){
        return soucheDao.findById(id);
    }

    public SoucheView findSoucheView(int id){
        Optional<SoucheEntity> souche = soucheDao.findById(id);

        return SoucheConvert.soucheEntityToView(souche.orElse(new SoucheEntity()));
    }
}
