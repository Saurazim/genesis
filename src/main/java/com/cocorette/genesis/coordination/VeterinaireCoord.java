package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.VeterinaireConvert;
import com.cocorette.genesis.dao.VeterinaireDao;
import com.cocorette.genesis.model.entity.VeterinaireEntity;
import com.cocorette.genesis.model.form.VeterinaireForm;
import com.cocorette.genesis.model.table.VeterinaireTable;
import com.cocorette.genesis.model.view.VeterinaireView;
import com.cocorette.genesis.service.VeterinaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Component
public class VeterinaireCoord {
    @Autowired
    VeterinaireService veterinaireService;

    public void saveVeterinaire(VeterinaireForm form){
        VeterinaireEntity entity = VeterinaireConvert.veterinaireFormToEntity(form);
        entity.setActive(true);
        entity.setArchive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        veterinaireService.saveVeterinaire(entity);
    }

    public Map<String, String> validVeterinaire(VeterinaireForm form){
        Map<String, String> error = new HashMap<>();

        if (form.getNom().isBlank())
            error.put("nom","Le nom est obligatoire");

        return error;
    }

    public List<VeterinaireTable> findAll(){
        return veterinaireService.findAll();
    }

    public VeterinaireView findVeterinaireView(int id){
        return veterinaireService.findVeterinaireView(id);
    }
}
