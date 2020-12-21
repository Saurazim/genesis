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
        bo.setCommentaire(entity.getCommentaire());
        bo.setActive(entity.isActive());
        bo.setArchive(entity.isArchive());
        bo.setCreated(entity.getCreated());
        bo.setModified(entity.getModified());

        return bo;
    }

    public static AlimentEntity alimentBoToEntity(AlimentBo bo){
        AlimentEntity entity = new AlimentEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getNom());
        entity.setCommentaire(bo.getCommentaire());
        entity.setActive(bo.isActive());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());

        return entity;
    }

    public static AlimentBo alimentFormToBo(AlimentForm form){
        AlimentBo bo = new AlimentBo();
        bo.setNom(form.getNom());
        bo.setCommentaire(form.getCommentaire());

        return bo;
    }

    public static AlimentView alimentBoToView(AlimentBo bo){
        AlimentView view = new AlimentView();
        view.setId(bo.getId());
        view.setNom(bo.getNom());
        view.setCommentaire(bo.getCommentaire());
        view.setActive(bo.isActive());
        view.setArchive(bo.isArchive());
        view.setCreated(bo.getCreated());
        view.setModified(bo.getModified());

        return view;
    }

    public static AlimentTable alimentBoToTable(AlimentBo bo){
        AlimentTable table = new AlimentTable();
        table.setId(bo.getId());
        table.setNom(bo.getNom());
        table.setCommentaire(bo.getCommentaire());
        table.setActive(bo.isActive());
        table.setArchive(bo.isArchive());
        table.setCreated(bo.getCreated());
        table.setModified(bo.getModified());

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
