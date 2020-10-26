package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.EntrepriseConvert;
import com.cocorette.genesis.model.bo.EntrepriseBo;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.entity.EntrepriseEntity;
import com.cocorette.genesis.model.form.EntrepriseForm;
import com.cocorette.genesis.model.table.EntrepriseTable;
import com.cocorette.genesis.model.view.EntrepriseView;
import com.cocorette.genesis.service.AdresseService;
import com.cocorette.genesis.service.ContactService;
import com.cocorette.genesis.service.EleveurService;
import com.cocorette.genesis.service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EntrepriseCoord {
    @Autowired
    EleveurService eleveurService;
    @Autowired
    EntrepriseService entrepriseService;
    @Autowired
    ContactService contactService;
    @Autowired
    AdresseService adresseService;

    public void saveEntreprise(EntrepriseForm form){
        EntrepriseEntity entity = EntrepriseConvert.entrepriseFormToEntity(form);
        contactService.saveContact(entity.getContact());
        adresseService.saveAdresse(entity.getAdresse());
        EleveurEntity eleveur = eleveurService.findEleveur(form.getEleveurId()).orElseThrow();
        entity.setEleveur(eleveur);
        entrepriseService.saveEntreprise(entity);
    }

    public List<EntrepriseTable> findAll(){
        return entrepriseService.findAll();
    }

    public EntrepriseView findEntrepriseView(int id){
        return entrepriseService.findEntrepriseView(id);
    }
}
