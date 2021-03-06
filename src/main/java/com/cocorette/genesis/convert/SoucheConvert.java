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
        bo.setNom(entity.getNom());
        bo.setCommentaire(entity.getCommentaire());
        bo.setActive(entity.isActive());
        bo.setArchive(entity.isArchive());
        bo.setCreated(entity.getCreated());
        bo.setModified(entity.getModified());

        return bo;
    }

    public static SoucheEntity soucheBoToEntity(SoucheBo bo){
        SoucheEntity entity = new SoucheEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getNom());
        entity.setCommentaire(bo.getCommentaire());
        entity.setActive(bo.isActive());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());

        return entity;
    }

    public static SoucheBo soucheFormToBo(SoucheForm form){
        SoucheBo bo = new SoucheBo();
        bo.setNom(form.getNom());
        bo.setCommentaire(form.getCommentaire());


        return bo;
    }

    public static SoucheView soucheBoToView(SoucheBo bo){
        SoucheView view = new SoucheView();
        view.setId(bo.getId());
        view.setNom(bo.getNom());
        view.setCommentaire(bo.getCommentaire());
        view.setActive(bo.isActive());
        view.setArchive(bo.isArchive());
        view.setCreated(bo.getCreated());
        view.setModified(bo.getModified());

        return view;
    }

    public static SoucheTable soucheBoToTable(SoucheBo bo){
        SoucheTable table = new SoucheTable();
        table.setId(bo.getId());
        table.setNom(bo.getNom());
        table.setCommentaire(bo.getCommentaire());
        table.setActive(bo.isActive());
        table.setArchive(bo.isArchive());
        table.setCreated(bo.getCreated());
        table.setModified(bo.getModified());

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
