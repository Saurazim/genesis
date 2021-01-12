package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.CentreConvert;
import com.cocorette.genesis.model.entity.CentreEntity;
import com.cocorette.genesis.model.form.CentreForm;
import com.cocorette.genesis.model.table.CentreTable;
import com.cocorette.genesis.model.view.CentreView;
import com.cocorette.genesis.service.CentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CentreCoord {
    @Autowired
    CentreService centreService;

    public void saveCentre(CentreForm form){
        CentreEntity entity = CentreConvert.centreFormToEntity(form);
        entity.setActive(true);
        entity.setArchive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        centreService.saveCentre(entity);
    }

    public Map<String, String> validCentre(CentreForm form){
        Map<String, String> error = new HashMap<>();

        if (form.getNom().isBlank())
            error.put("nom", "Le nom est obligatoire");

        return error;
    }

    public List<CentreTable> findAll(){
        return centreService.findAll();
    }

    public CentreView findCentreView(int id){
        return centreService.findCentreView(id);
    }
}
