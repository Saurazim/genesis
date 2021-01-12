package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.CentreConvert;
import com.cocorette.genesis.dao.CentreDao;
import com.cocorette.genesis.model.entity.CentreEntity;
import com.cocorette.genesis.model.table.CentreTable;
import com.cocorette.genesis.model.view.CentreView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CentreService {
    @Autowired
    CentreDao centreDao;

    public List<CentreTable> findAll(){
        List<CentreEntity> entities = centreDao.findAll();
        List<CentreTable> tables = new ArrayList<>();
        for (CentreEntity entity: entities){
            CentreTable table = CentreConvert.centreEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }

    public CentreEntity saveCentre(CentreEntity entity){
        return centreDao.save(entity);
    }

    public Optional<CentreEntity> findById(int id){
        return centreDao.findById(id);
    }

    public CentreView findCentreView(int id){
        Optional<CentreEntity> centre = centreDao.findById(id);

        return CentreConvert.centreEntityToView(centre.orElse(new CentreEntity()));
    }
}
