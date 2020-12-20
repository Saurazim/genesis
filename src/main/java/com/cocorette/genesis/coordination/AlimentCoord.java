package com.cocorette.genesis.coordination;

import com.cocorette.genesis.convert.AlimentConvert;
import com.cocorette.genesis.model.entity.AlimentEntity;
import com.cocorette.genesis.model.form.AlimentForm;
import com.cocorette.genesis.model.table.AlimentTable;
import com.cocorette.genesis.model.view.AlimentView;
import com.cocorette.genesis.service.AlimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlimentCoord {
    @Autowired
    AlimentService alimentService;

    public void saveAliment(AlimentForm form){
        AlimentEntity entity = AlimentConvert.alimentFormToEntity(form);
        alimentService.saveAliment(entity);
    }

    public List<AlimentTable> findAll(){
        return alimentService.findAll();
    }

    public AlimentView findAlimentView(int id){
        return alimentService.findAlimentView(id);
    }
}
