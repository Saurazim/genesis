package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.AlimentConvert;
import com.cocorette.genesis.model.entity.AlimentEntity;
import com.cocorette.genesis.model.form.AlimentForm;
import com.cocorette.genesis.model.table.AlimentTable;
import com.cocorette.genesis.model.view.AlimentView;
import com.cocorette.genesis.service.AlimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AlimentCoord {
    @Autowired
    AlimentService alimentService;

    public void saveAliment(AlimentForm form){
        AlimentEntity entity = AlimentConvert.alimentFormToEntity(form);
        entity.setActive(true);
        entity.setArchive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        alimentService.saveAliment(entity);
    }

    public Map<String, String> validAliment(AlimentForm form){
        Map<String, String> error = new HashMap<>();

        if (form.getNom().isBlank())
            error.put("nom","Le nom est obligatoire");

        return error;
    }

    public List<AlimentTable> findAll(){
        return alimentService.findAll();
    }

    public AlimentView findAlimentView(int id){
        return alimentService.findAlimentView(id);
    }
}
