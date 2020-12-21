package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.CouvoirBo;
import com.cocorette.genesis.model.entity.CouvoirEntity;
import com.cocorette.genesis.model.form.CouvoirForm;
import com.cocorette.genesis.model.table.CouvoirTable;
import com.cocorette.genesis.model.view.CouvoirView;

public class CouvoirConvert {
    public static CouvoirBo couvoirEntityToBo(CouvoirEntity entity){
        CouvoirBo bo = new CouvoirBo();
        bo.setId(entity.getId());
        bo.setNom(entity.getNom());
        bo.setCommentaire(entity.getCommentaire());
        bo.setActive(entity.isActive());
        bo.setArchive(entity.isArchive());
        bo.setCreated(entity.getCreated());
        bo.setModified(entity.getModified());

        return bo;
    }

    public static CouvoirEntity couvoirBoToEntity(CouvoirBo bo){
        CouvoirEntity entity = new CouvoirEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getNom());
        entity.setCommentaire(bo.getCommentaire());
        entity.setActive(bo.isActive());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());

        return entity;
    }

    public static CouvoirBo couvoirFormToBo(CouvoirForm form){
        CouvoirBo bo = new CouvoirBo();
        bo.setNom(form.getNom());
        bo.setCommentaire(form.getCommentaire());

        return bo;
    }

    public static CouvoirView couvoirBoToView(CouvoirBo bo){
        CouvoirView view = new CouvoirView();
        view.setId(bo.getId());
        view.setNom(bo.getNom());
        view.setCommentaire(bo.getCommentaire());
        view.setActive(bo.isActive());
        view.setArchive(bo.isArchive());
        view.setCreated(bo.getCreated());
        view.setModified(bo.getModified());

        return view;
    }

    public static CouvoirTable couvoirBoToTable(CouvoirBo bo){
        CouvoirTable table = new CouvoirTable();
        table.setId(bo.getId());
        table.setNom(bo.getNom());
        table.setCommentaire(bo.getCommentaire());
        table.setActive(bo.isActive());
        table.setArchive(bo.isArchive());
        table.setCreated(bo.getCreated());
        table.setModified(bo.getModified());

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
