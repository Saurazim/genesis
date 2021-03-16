package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.BatimentConvert;
import com.cocorette.genesis.dao.BatimentDao;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.view.BatimentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BatimentService {
    @Autowired
    BatimentDao batimentDao;

    public BatimentView findBatimentView(int id){
        Optional<BatimentEntity> batiment = batimentDao.findById(id);

        return BatimentConvert.batimentEntityToView(batiment.orElseThrow());
    }

    public BatimentEntity findBatiment(int id){
        return batimentDao.findById(id).orElseThrow();
    }

    public List<BatimentTable> findAll(){
        List<BatimentEntity> entities = batimentDao.findAll();
        List<BatimentTable> tables = new ArrayList<>();
        for(BatimentEntity entity : entities){
            BatimentTable table = BatimentConvert.batimentEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }

    public BatimentEntity saveBatiment(BatimentEntity entity){
        return batimentDao.save(entity);
    }

    public List<BatimentTable> findBatimentByEntreprise(EntrepriseEntity entreprise){
        List<BatimentEntity> entities = batimentDao.findAllByEntreprise(entreprise);
        List<BatimentTable> tables = new ArrayList<>();
        for (BatimentEntity entity : entities){
            BatimentTable table = BatimentConvert.batimentEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }
}
