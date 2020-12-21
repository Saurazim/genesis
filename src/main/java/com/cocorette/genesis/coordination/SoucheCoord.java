package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.SoucheConvert;
import com.cocorette.genesis.model.entity.SoucheEntity;
import com.cocorette.genesis.model.form.SoucheForm;
import com.cocorette.genesis.model.table.SoucheTable;
import com.cocorette.genesis.model.view.SoucheView;
import com.cocorette.genesis.service.SoucheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SoucheCoord {
    @Autowired
    SoucheService soucheService;

    public void saveSouche(SoucheForm form){
        SoucheEntity entity = SoucheConvert.soucheFormToEntity(form);
        entity.setActive(true);
        entity.setActive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        soucheService.saveSouche(entity);
    }

    public Map<String, String> validSouche(SoucheForm form){
        Map<String,String> error = new HashMap<>();

        if (form.getNom().isBlank())
            error.put("nom","Le nom est obligatoire");

        return error;
    }

    public List<SoucheTable> findAll(){
        return soucheService.findAll();
    }

    public SoucheView findSoucheView(int id){
        return soucheService.findSoucheView(id);
    }

}
