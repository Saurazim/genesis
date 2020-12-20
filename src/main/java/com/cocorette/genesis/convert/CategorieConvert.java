package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.CategorieBo;
import com.cocorette.genesis.model.entity.CategorieEntity;
import com.cocorette.genesis.model.form.CategorieForm;
import com.cocorette.genesis.model.table.CategorieTable;
import com.cocorette.genesis.model.view.CategorieView;

public class CategorieConvert {
    public static CategorieBo categorieEntityToBo(CategorieEntity entity){
        CategorieBo bo = new CategorieBo();
        bo.setId(entity.getId());
        bo.setNom(entity.getNom());

        return bo;
    }

    public static CategorieEntity categorieBoToEntity(CategorieBo bo){
        CategorieEntity entity = new CategorieEntity();
        entity.setId(bo.getId());
        entity.setNom(bo.getNom());

        return entity;
    }

    public static CategorieBo categorieFormToBo(CategorieForm form){
        CategorieBo bo = new CategorieBo();
        bo.setNom(form.getNom());

        return bo;
    }

    public static CategorieView categorieBoToView(CategorieBo bo){
        CategorieView view = new CategorieView();
        view.setId(bo.getId());
        view.setNom(bo.getNom());

        return view;
    }

    public static CategorieTable categorieBoToTable(CategorieBo bo){
        CategorieTable table = new CategorieTable();
        table.setId(bo.getId());
        table.setNom(bo.getNom());

        return table;
    }

    public static CategorieEntity categorieFormToEntity(CategorieForm form){
        CategorieBo bo = categorieFormToBo(form);

        return categorieBoToEntity(bo);
    }

    public static CategorieView categorieEntityToView(CategorieEntity entity){
        CategorieBo bo = categorieEntityToBo(entity);

        return categorieBoToView(bo);
    }

    public static CategorieTable categorieEntityToTable(CategorieEntity entity){
        CategorieBo bo = categorieEntityToBo(entity);

        return categorieBoToTable(bo);
    }
}
