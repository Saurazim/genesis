package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.CategorieConvert;
import com.cocorette.genesis.model.entity.CategorieEntity;
import com.cocorette.genesis.model.form.CategorieForm;
import com.cocorette.genesis.model.table.CategorieTable;
import com.cocorette.genesis.model.view.CategorieView;
import com.cocorette.genesis.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategorieCoord {
    @Autowired
    CategorieService categorieService;

    public void saveCategorie(CategorieForm form){
        CategorieEntity entity = CategorieConvert.categorieFormToEntity(form);
        entity.setActive(true);
        entity.setActive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        categorieService.saveCategorie(entity);
    }

    public Map<String, String> validCategorie(CategorieForm form){
        Map<String, String> error = new HashMap<>();

        if (form.getNom().isBlank())
            error.put("nom","Le nom est obligatoire");

        return error;
    }

    public CategorieView findCategorieView(int id){
        return categorieService.findCategView(id);
    }

    public List<CategorieTable> findAll(){
        return categorieService.findAll();
    }
}
