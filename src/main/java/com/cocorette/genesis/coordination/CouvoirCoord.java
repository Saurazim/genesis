package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.CouvoirConvert;
import com.cocorette.genesis.model.entity.CouvoirEntity;
import com.cocorette.genesis.model.form.CouvoirForm;
import com.cocorette.genesis.model.table.CouvoirTable;
import com.cocorette.genesis.model.view.CouvoirView;
import com.cocorette.genesis.service.CouvoirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CouvoirCoord {
    @Autowired
    CouvoirService couvoirService;

    public void saveCouvoir(CouvoirForm form){
        CouvoirEntity entity = CouvoirConvert.couvoirFormToEntity(form);
        entity.setActive(true);
        entity.setActive(false);
        entity.setCreated(LocalDateTime.now());
        entity.setModified(LocalDateTime.now());
        couvoirService.saveCouvoir(entity);
    }

    public Map<String, String> validCouvoir(CouvoirForm form){
        Map<String,String> error = new HashMap<>();

        if (form.getNom().isBlank())
            error.put("nom","Le nom est obligatoire");

        return error;
    }

    public List<CouvoirTable> findAll(){
        return couvoirService.findAll();
    }

    public CouvoirView findCouvoirView(int id){
        return couvoirService.findCouvoirView(id);
    }
}
