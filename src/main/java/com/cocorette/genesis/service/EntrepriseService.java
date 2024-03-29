package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.EntrepriseConvert;
import com.cocorette.genesis.dao.EntrepriseDao;
import com.cocorette.genesis.model.bo.EntrepriseBo;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.view.EntrepriseView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EntrepriseService {
    @Autowired
    EntrepriseDao entrepriseDao;

    public EntrepriseView findEntrepriseView(int id){
        Optional<EntrepriseEntity> entreprise = entrepriseDao.findById(id);

        return EntrepriseConvert.entrepriseEntityToView(entreprise.orElse(new EntrepriseEntity()));
    }

    public Optional<EntrepriseEntity> findEntreprise(int id){
        return entrepriseDao.findById(id);
    }

    public EntrepriseBo findEntrepriseBo(int id){
        Optional<EntrepriseEntity> entity = entrepriseDao.findById(id);

        return EntrepriseConvert.entrepriseEntityToBo(entity.orElseThrow());
    }

    public List<EntrepriseTable> findAll(){
        List<EntrepriseEntity> entities = entrepriseDao.findAll();
        List<EntrepriseTable> tables = new ArrayList<>();
        for(EntrepriseEntity entity: entities){
            EntrepriseTable table = EntrepriseConvert.entrepriseEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }

    public void saveEntreprise(EntrepriseEntity entity){
        entrepriseDao.save(entity);
    }

    public List<EntrepriseTable> findEntrepriseByEleveur(EleveurEntity eleveur){
        List<EntrepriseEntity> entities = entrepriseDao.findAllByEleveur(eleveur);
        List<EntrepriseTable> tables = new ArrayList<>();
        for (EntrepriseEntity entity : entities) {
            EntrepriseTable table = EntrepriseConvert.entrepriseEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }
}
