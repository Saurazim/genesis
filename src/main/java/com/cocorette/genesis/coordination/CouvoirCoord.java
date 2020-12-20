package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.CouvoirConvert;
import com.cocorette.genesis.model.entity.CouvoirEntity;
import com.cocorette.genesis.model.form.CouvoirForm;
import com.cocorette.genesis.model.table.CouvoirTable;
import com.cocorette.genesis.model.view.CouvoirView;
import com.cocorette.genesis.service.CouvoirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CouvoirCoord {
    @Autowired
    CouvoirService couvoirService;

    public void saveCouvoir(CouvoirForm form){
        CouvoirEntity entity = CouvoirConvert.couvoirFormToEntity(form);
        couvoirService.saveCouvoir(entity);
    }

    public List<CouvoirTable> findAll(){
        return couvoirService.findAll();
    }

    public CouvoirView findCouvoirView(int id){
        return couvoirService.findCouvoirView(id);
    }
}
