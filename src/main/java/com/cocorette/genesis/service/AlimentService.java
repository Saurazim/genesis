package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.AlimentConvert;
import com.cocorette.genesis.dao.AlimentDao;
import com.cocorette.genesis.model.entity.AlimentEntity;
import com.cocorette.genesis.model.table.AlimentTable;
import com.cocorette.genesis.model.view.AlimentView;
import com.cocorette.genesis.model.view.CategorieView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlimentService {
    @Autowired
    AlimentDao alimentDao;

    public List<AlimentTable> findAll(){
        List<AlimentEntity> entities = alimentDao.findAll();
        List<AlimentTable> tables = new ArrayList<>();
        for (AlimentEntity entity: entities) {
            AlimentTable table = AlimentConvert.alimentEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }

    public AlimentEntity saveAliment(AlimentEntity entity){
        return alimentDao.save(entity);
    }

    public Optional<AlimentEntity> findById(int id){
        return alimentDao.findById(id);
    }

    public AlimentView findAlimentView(int id){
        Optional<AlimentEntity> aliment = alimentDao.findById(id);

        return AlimentConvert.alimentEntityToView(aliment.orElse(new AlimentEntity()));
    }
}
