package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.SoucheBo;
import com.cocorette.genesis.model.entity.SoucheEntity;
import com.cocorette.genesis.model.form.SoucheForm;
import com.cocorette.genesis.model.table.SoucheTable;
import com.cocorette.genesis.model.view.SoucheView;

public class SoucheConvert {
    public static SoucheBo soucheEntityToBo(SoucheEntity entity){
        SoucheBo bo = new SoucheBo();
        bo.setId(entity.getId());
        bo.setNom(bo.getNom());

        return bo;
    }

    public static SoucheEntity soucheBoToEntity(SoucheBo bo){
        SoucheEntity entity = new SoucheEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getNom());

        return entity;
    }

    public static SoucheBo soucheFormToBo(SoucheForm form){
        SoucheBo bo = new SoucheBo();
        bo.setNom(form.getNom());

        return bo;
    }

    public static SoucheView soucheBoToView(SoucheBo bo){
        SoucheView view = new SoucheView();
        view.setId(bo.getId());
        view.setNom(bo.getNom());

        return view;
    }

    public static SoucheTable soucheBoToTable(SoucheBo bo){
        SoucheTable table = new SoucheTable();
        table.setId(bo.getId());
        table.setNom(bo.getNom());

        return table;
    }

    public static SoucheEntity soucheFormToEntity(SoucheForm form){
        SoucheBo bo = soucheFormToBo(form);

        return soucheBoToEntity(bo);
    }

    public static SoucheView soucheEntityToView(SoucheEntity entity){
        SoucheBo bo = soucheEntityToBo(entity);

        return soucheBoToView(bo);
    }

    public static SoucheTable soucheEntityToTable(SoucheEntity entity){
        SoucheBo bo = soucheEntityToBo(entity);

        return soucheBoToTable(bo);
    }
}
