package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.CategorieConvert;
import com.cocorette.genesis.model.entity.CategorieEntity;
import com.cocorette.genesis.model.form.CategorieForm;
import com.cocorette.genesis.model.table.CategorieTable;
import com.cocorette.genesis.model.view.CategorieView;
import com.cocorette.genesis.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategorieCoord {
    @Autowired
    CategorieService categorieService;

    public void saveCategorie(CategorieForm form){
        CategorieEntity entity = CategorieConvert.categorieFormToEntity(form);
        categorieService.saveCategorie(entity);
    }

    public CategorieView findCategorieView(int id){
        return categorieService.findCategView(id);
    }

    public List<CategorieTable> findAll(){
        return categorieService.findAll();
    }
}
