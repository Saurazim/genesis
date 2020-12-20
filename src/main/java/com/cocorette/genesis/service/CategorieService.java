package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.CategorieConvert;
import com.cocorette.genesis.dao.CategorieDao;
import com.cocorette.genesis.model.entity.CategorieEntity;
import com.cocorette.genesis.model.table.CategorieTable;
import com.cocorette.genesis.model.view.CategorieView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {
    @Autowired
    CategorieDao categorieDao;

    public List<CategorieTable> findAll(){
        List<CategorieEntity> entities = categorieDao.findAll();
        List<CategorieTable> tables = new ArrayList<>();
        for (CategorieEntity entity: entities) {
            CategorieTable table = CategorieConvert.categorieEntityToTable(entity);
            tables.add(table);
        }

        return tables;
    }

    public CategorieEntity saveCategorie(CategorieEntity entity){
        return  categorieDao.save(entity);
    }

    public Optional<CategorieEntity> findById(int id){
        return categorieDao.findById(id);
    }

    public CategorieView findCategView(int id){
        Optional<CategorieEntity> categorie = categorieDao.findById(id);

        return CategorieConvert.categorieEntityToView(categorie.orElse(new CategorieEntity()));
    }
}
