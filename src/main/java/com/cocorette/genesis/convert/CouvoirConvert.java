package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.CouvoirBo;
import com.cocorette.genesis.model.entity.CouvoirEntity;
import com.cocorette.genesis.model.form.CouvoirForm;
import com.cocorette.genesis.model.table.CouvoirTable;
import com.cocorette.genesis.model.view.CouvoirView;

public class CouvoirConvert {
    public static CouvoirBo couvoirEntityToBo(CouvoirEntity entity){
        return new CouvoirBo(entity.getId(), entity.getName());
    }

    public static CouvoirEntity couvoirBoToEntity(CouvoirBo bo){
        return new CouvoirEntity(bo.getId(), bo.getNom());
    }

    public static CouvoirBo couvoirFormToBo(CouvoirForm form){
        CouvoirBo bo = new CouvoirBo();
        bo.setNom(form.getNom());

        return bo;
    }

    public static CouvoirView couvoirBoToView(CouvoirBo bo){
        CouvoirView view = new CouvoirView();
        view.setId(bo.getId());
        view.setNom(bo.getNom());

        return view;
    }

    public static CouvoirTable couvoirBoToTable(CouvoirBo bo){
        CouvoirTable table = new CouvoirTable();
        table.setId(bo.getId());
        table.setNom(bo.getNom());

        return table;
    }

    public static CouvoirEntity couvoirFormToEntity(CouvoirForm form){
        CouvoirBo bo = couvoirFormToBo(form);

        return couvoirBoToEntity(bo);
    }

    public static CouvoirView couvoirEntityToView(CouvoirEntity entity){
        CouvoirBo bo = couvoirEntityToBo(entity);

        return couvoirBoToView(bo);
    }

    public static CouvoirTable couvoirEntityToTable(CouvoirEntity entity){
        CouvoirBo bo = couvoirEntityToBo(entity);

        return couvoirBoToTable(bo);
    }
}
