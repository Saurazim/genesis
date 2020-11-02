package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.LotConvert;
import com.cocorette.genesis.dao.LotDao;
import com.cocorette.genesis.model.entity.LotEntity;
import com.cocorette.genesis.model.table.LotTable;
import com.cocorette.genesis.model.view.LotView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LotService {
    @Autowired
    LotDao lotDao;

    public LotView findLotView(int id){
        Optional<LotEntity> lot = lotDao.findById(id);

        return LotConvert.lotEntityToView(lot.orElse(new LotEntity()));
    }

    public Optional<LotEntity> findLot(int id){
        return lotDao.findById(id);
    }

    public List<LotTable> findAll(){
        List<LotEntity> entities = lotDao.findAll();
        List<LotTable> tables = new ArrayList<>();
        for(LotEntity entity : entities){
            LotTable table = LotConvert.lotEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }

    public void saveLot(LotEntity entity){
        lotDao.save(entity);
    }

    public List<LotTable> findLotByBatiment(int batimentId){
        List<LotEntity> entities = lotDao.findAllByBatimentId(batimentId);
        List<LotTable> tables = new ArrayList<>();
        for(LotEntity entity : entities){
            LotTable table = LotConvert.lotEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }
}
