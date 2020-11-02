package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.BatimentConvert;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.model.table.BatimentTable;
import com.cocorette.genesis.model.view.BatimentView;
import com.cocorette.genesis.service.AdresseService;
import com.cocorette.genesis.service.BatimentService;
import com.cocorette.genesis.service.EntrepriseService;
import com.cocorette.genesis.service.GpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BatimentCoord {
    @Autowired
    BatimentService batimentService;
    @Autowired
    AdresseService adresseService;
    @Autowired
    EntrepriseService entrepriseService;
    @Autowired
    GpsService gpsService;

    public void saveBatiment(BatimentForm form){
        BatimentEntity entity = BatimentConvert.batimentFormToEntity(form);
        adresseService.saveAdresse(entity.getAdresse());
        gpsService.saveGps(entity.getGps());
        EntrepriseEntity entreprise = entrepriseService.findEntreprise(form.getEntrepriseId()).orElseThrow();
        entity.setEntreprise(entreprise);
        batimentService.saveBatiment(entity);
    }

    public List<BatimentTable> findAll(){
        return batimentService.findAll();
    }

    public BatimentView findBatimentView(int id){
        return batimentService.findBatimentView(id);
    }

    public List<BatimentTable> findBatimentByEntrepriseId(int entrepriseId){
        return batimentService.findBatimentByEntreprise(entrepriseId);
    }
}
