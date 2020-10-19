package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.EleveurConvert;
import com.cocorette.genesis.dao.EleveurDao;
import com.cocorette.genesis.form.EleveurForm;
import com.cocorette.genesis.model.EleveurEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EleveurService {
    @Autowired
    EleveurDao eleveurDao;

    public EleveurForm findEleveurForm(int id){
        Optional<EleveurEntity> eleveur = eleveurDao.findById(id);

        return EleveurConvert.eleveurEntityToForm(eleveur.orElse(new EleveurEntity("Erreur","erreur")));
    }
    
    public List<EleveurForm> findAll(){
        List<EleveurEntity> entities = eleveurDao.findAll();
        List<EleveurForm> forms = new ArrayList<>();
        for (EleveurEntity entity: entities) {
            EleveurForm form = EleveurConvert.eleveurEntityToForm(entity);
            forms.add(form);
        }

        return forms;
    }

    public void saveEleveur(EleveurEntity entity){
        eleveurDao.save(entity);
    }


}
