package com.cocorette.genesis.service;

import com.cocorette.genesis.convert.EleveurConvert;
import com.cocorette.genesis.dao.EleveurDao;
import com.cocorette.genesis.form.EleveurForm;
import com.cocorette.genesis.model.Eleveur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EleveurService {
    @Autowired
    EleveurDao eleveurDao;

    public EleveurForm findEleveurForm(int id){
        Optional<Eleveur> eleveur = eleveurDao.findById(id);

        return EleveurConvert.eleveurEntityToForm(eleveur.orElse(new Eleveur("Erreur","erreur")));
    }


}
