package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.EleveurConvert;
import com.cocorette.genesis.dao.EleveurDao;
import com.cocorette.genesis.model.bo.EleveurBo;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.view.EleveurView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EleveurService {
    @Autowired
    EleveurDao eleveurDao;

    public EleveurView findEleveurView(int id){
        Optional<EleveurEntity> eleveur = eleveurDao.findById(id);

        return EleveurConvert.eleveurEntityToView(eleveur.orElse(new EleveurEntity("Erreur","erreur")));
    }

    public Optional<EleveurEntity> findEleveur(int id){
        return eleveurDao.findById(id);
    }

    public List<EleveurTable> findAll(){
        List<EleveurEntity> entities = eleveurDao.findAll();
        List<EleveurTable> tables = new ArrayList<>();
        for (EleveurEntity entity: entities) {
            EleveurTable table = EleveurConvert.eleveurEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }

    public void saveEleveur(EleveurEntity entity){
        eleveurDao.save(entity);
    }

    public void saveAllEleveurs(List<EleveurForm> eleveurForms){
        List<EleveurEntity> eleveurEntities = new ArrayList<>();

        for (EleveurForm form : eleveurForms){
            EleveurEntity entity = EleveurConvert.eleveurFormToEntity(form);
            eleveurEntities.add(entity);
        }

        eleveurDao.saveAll(eleveurEntities);
    }

}
