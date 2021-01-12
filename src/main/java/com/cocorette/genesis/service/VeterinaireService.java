package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.VeterinaireConvert;
import com.cocorette.genesis.dao.VeterinaireDao;
import com.cocorette.genesis.model.entity.VeterinaireEntity;
import com.cocorette.genesis.model.table.VeterinaireTable;
import com.cocorette.genesis.model.view.VeterinaireView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VeterinaireService {
    @Autowired
    VeterinaireDao veterinaireDao;

    public List<VeterinaireTable> findAll(){
        List<VeterinaireEntity> entities = veterinaireDao.findAll();
        List<VeterinaireTable> tables = new ArrayList<>();
        for (VeterinaireEntity entity: entities){
            VeterinaireTable table = VeterinaireConvert.veterinaireEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }

    public VeterinaireEntity saveVeterinaire(VeterinaireEntity entity){
        return veterinaireDao.save(entity);
    }

    public Optional<VeterinaireEntity> findById(int id){
        return veterinaireDao.findById(id);
    }

    public VeterinaireView findVeterinaireView(int id){
        Optional<VeterinaireEntity> veterinaire = veterinaireDao.findById(id);

        return VeterinaireConvert.veterinaireEntityToView(veterinaire.orElse(new VeterinaireEntity()));
    }
}
