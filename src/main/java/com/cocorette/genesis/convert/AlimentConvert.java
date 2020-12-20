package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.AlimentBo;
import com.cocorette.genesis.model.entity.AlimentEntity;
import com.cocorette.genesis.model.form.AlimentForm;
import com.cocorette.genesis.model.table.AlimentTable;
import com.cocorette.genesis.model.view.AlimentView;

public class AlimentConvert {
    public static AlimentBo alimentEntityToBo(AlimentEntity entity){
        AlimentBo bo = new AlimentBo();
        bo.setId(entity.getId());
        bo.setNom(entity.getNom());

        return bo;
    }

    public static AlimentEntity alimentBoToEntity(AlimentBo bo){
        AlimentEntity entity = new AlimentEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getNom());

        return entity;
    }

    public static AlimentBo alimentFormToBo(AlimentForm form){
        AlimentBo bo = new AlimentBo();
        bo.setNom(bo.getNom());

        return bo;
    }

    public static AlimentView alimentBoToView(AlimentBo bo){
        AlimentView view = new AlimentView();
        view.setId(bo.getId());
        view.setNom(bo.getNom());

        return view;
    }

    public static AlimentTable alimentBoToTable(AlimentBo bo){
        AlimentTable table = new AlimentTable();
        table.setId(bo.getId());
        table.setNom(bo.getNom());

        return table;
    }

    public static AlimentEntity alimentFormToEntity(AlimentForm form){
        AlimentBo bo = alimentFormToBo(form);

        return alimentBoToEntity(bo);
    }

    public static AlimentView alimentEntityToView(AlimentEntity entity){
        AlimentBo bo = alimentEntityToBo(entity);

        return alimentBoToView(bo);
    }

    public static AlimentTable alimentEntityToTable(AlimentEntity entity){
        AlimentBo bo = alimentEntityToBo(entity);

        return alimentBoToTable(bo);
    }
}
