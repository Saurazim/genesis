package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.BatimentConvert;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.form.BatimentForm;
import com.cocorette.genesis.service.BatimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BatimentCoord {
    @Autowired
    BatimentService batimentService;

    public void saveBatiment(BatimentForm form){
        BatimentEntity entity = BatimentConvert.batimentFormToEntity(form);
    }
}
