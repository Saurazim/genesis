package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.EleveurConvert;
import com.cocorette.genesis.model.bo.EleveurBo;
import com.cocorette.genesis.model.entity.EleveurEntity;
import com.cocorette.genesis.model.form.EleveurForm;
import com.cocorette.genesis.model.table.EleveurTable;
import com.cocorette.genesis.model.view.EleveurView;
import com.cocorette.genesis.service.ContactService;
import com.cocorette.genesis.service.EleveurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EleveurCoord {
    @Autowired
    EleveurService eleveurService;

    @Autowired
    ContactService contactService;

    public void saveEleveur(EleveurForm form){
        EleveurEntity entity = EleveurConvert.eleveurFormToEntity(form);
        contactService.saveContact(entity.getContact());
        eleveurService.saveEleveur(entity);
    }

    public EleveurView findEleveurView(int id){
        return eleveurService.findEleveurView(id);
    }

    public List<EleveurTable> findAll(){
        return eleveurService.findAll();
    }
}
