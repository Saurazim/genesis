package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.SoucheConvert;
import com.cocorette.genesis.model.entity.SoucheEntity;
import com.cocorette.genesis.model.form.SoucheForm;
import com.cocorette.genesis.model.table.SoucheTable;
import com.cocorette.genesis.model.view.SoucheView;
import com.cocorette.genesis.service.SoucheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SoucheCoord {
    @Autowired
    SoucheService soucheService;

    public void saveSouche(SoucheForm form){
        SoucheEntity entity = SoucheConvert.soucheFormToEntity(form);
        soucheService.saveSouche(entity);
    }

    public List<SoucheTable> findAll(){
        return soucheService.findAll();
    }

    public SoucheView findSoucheView(int id){
        return soucheService.findSoucheView(id);
    }

}
