package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.LotConvert;
import com.cocorette.genesis.model.entity.BatimentEntity;
import com.cocorette.genesis.model.entity.LotEntity;
import com.cocorette.genesis.model.form.LotForm;
import com.cocorette.genesis.model.table.LotTable;
import com.cocorette.genesis.model.view.LotView;
import com.cocorette.genesis.service.BatimentService;
import com.cocorette.genesis.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LotCoord {
    @Autowired
    LotService lotService;
    @Autowired
    BatimentService batimentService;

    public void saveLot(LotForm form){
        LotEntity entity = LotConvert.lotFormToEntity(form);
        BatimentEntity batiment = batimentService.findBatiment(form.getBatimentId()).orElseThrow();
        entity.setBatimentEntity(batiment);
        lotService.saveLot(entity);
    }

    public List<LotTable> findAll(){
        return lotService.findAll();
    }

    public LotView findLotView(int id){
        return lotService.findLotView(id);
    }
}
