package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.*;
import com.cocorette.genesis.model.entity.LotEntity;
import com.cocorette.genesis.model.form.LotForm;
import com.cocorette.genesis.model.table.LotTable;
import com.cocorette.genesis.model.transitionnel.BatimentPo;
import com.cocorette.genesis.model.view.LotView;

public class LotConvert {
    public static LotBo lotEntityToBo(LotEntity entity){
        LotBo bo = new LotBo();
        bo.setId(entity.getId());
        bo.setCodeOeuf(entity.getCodeOeuf());
        bo.setBatimentPo(BatimentConvert.batimentEntityToPo(entity.getBatimentEntity()));
        bo.setDureeProdTheorique(entity.getDureeProdTheorique());
        bo.setDureeProdReelle(entity.getDureeProdReelle());
        bo.setCategorieBo(CategorieConvert.categorieEntityToBo(entity.getCategorieEntity()));
        bo.setCouvoirBo(CouvoirConvert.couvoirEntityToBo(entity.getCouvoirEntity()));
        bo.setSoucheBo(SoucheConvert.soucheEntityToBo(entity.getSoucheEntity()));
        bo.setAlimentBo(AlimentConvert.alimentEntityToBo(entity.getAlimentEntity()));
        bo.setNbPoulesMEP(entity.getNbPoulesMEP());
        bo.setFinLotTheorique(entity.getFinLotTheorique());
        bo.setCoefErosion(entity.getCoefErosion());
        bo.setDernierLot(entity.isDernierLot());
        bo.setNaissancePoules(entity.getNaissancePoules());
        bo.setMep(entity.getMep());
        bo.setFinLot(entity.getFinLot());
        bo.setCommentaires(entity.getCommentaire());
        bo.setActif(entity.isActif());
        bo.setArchive(entity.isArchive());
        bo.setCreated(entity.getCreated());
        bo.setModified(entity.getModified());

        return bo;
    }

    public static LotEntity lotBoToEntity(LotBo bo){
        LotEntity entity = new LotEntity();
        entity.setId(bo.getId());
        entity.setCodeOeuf(bo.getCodeOeuf());
        entity.setDureeProdTheorique(bo.getDureeProdTheorique());
        entity.setDureeProdReelle(bo.getDureeProdReelle());
        entity.setCategorieEntity(CategorieConvert.categorieBoToEntity(bo.getCategorieBo()));
        entity.setCouvoirEntity(CouvoirConvert.couvoirBoToEntity(bo.getCouvoirBo()));
        entity.setSoucheEntity(SoucheConvert.soucheBoToEntity(bo.getSoucheBo()));
        entity.setAlimentEntity(AlimentConvert.alimentBoToEntity(bo.getAlimentBo()));
        entity.setNbPoulesMEP(bo.getNbPoulesMEP());
        entity.setFinLotTheorique(bo.getFinLotTheorique());
        entity.setCoefErosion(bo.getCoefErosion());
        entity.setDernierLot(bo.isDernierLot());
        entity.setNaissancePoules(bo.getNaissancePoules());
        entity.setMep(bo.getMep());
        entity.setFinLot(bo.getFinLot());
        entity.setCommentaire(bo.getCommentaires());
        entity.setActif(bo.isActif());
        entity.setArchive(bo.isArchive());
        entity.setCreated(bo.getCreated());
        entity.setModified(bo.getModified());

        return entity;
    }

    public static LotBo lotFormToBo(LotForm form){
        LotBo bo = new LotBo();
        bo.setCodeOeuf(form.getCodeOeuf());
        bo.setBatimentPo(new BatimentPo(form.getBatimentId()));
        bo.setCategorieBo(new CategorieBo(form.getCategorieId()));
        bo.setCouvoirBo(new CouvoirBo(form.getCouvoirId()));
        bo.setSoucheBo(new SoucheBo(form.getSoucheId()));
        bo.setAlimentBo(new AlimentBo(form.getAlimentId()));
        bo.setNbPoulesMEP(form.getNbPoulesMEP());
        bo.setDernierLot(form.isDernierLot());
        bo.setNaissancePoules(form.getNaissancePoules());
        bo.setMep(form.getMep());
        bo.setCommentaires(form.getCommentaire());
        bo.setCreated(form.getCreated());
        bo.setModified(form.getModified());

        return bo;
    }

    public static LotView lotBoToView(LotBo bo){
        LotView view = new LotView();
        view.setCodeOeuf(bo.getCodeOeuf());
        view.setBatiment(bo.getBatimentPo().getCodeInterne());
        view.setBatimentId(bo.getBatimentPo().getId());
        view.setCategorie(bo.getCategorieBo().getNom());
        view.setCouvoir(bo.getCouvoirBo().getNom());
        view.setCouvoirId(bo.getCouvoirBo().getId());
        view.setSouche(bo.getSoucheBo().getNom());
        view.setSoucheId(bo.getSoucheBo().getId());
        view.setAliment(bo.getAlimentBo().getNom());
        view.setAlimentId(bo.getAlimentBo().getId());
        view.setDureeProdTheorique(bo.getDureeProdTheorique());
        view.setDureeProdReelle(bo.getDureeProdReelle());
        view.setNbPoulesMEP(bo.getNbPoulesMEP());
        view.setFinLotTheorique(bo.getFinLotTheorique());
        view.setCoefErosion(bo.getCoefErosion());
        view.setDernierLot(bo.isDernierLot());
        view.setNaissancePoules(bo.getNaissancePoules());
        view.setMep(bo.getMep());
        view.setFinLot(bo.getFinLot());
        view.setCommentaire(bo.getCommentaires());
        view.setCreated(bo.getCreated());
        view.setModified(bo.getModified());
        view.setActif(bo.isActif());
        view.setArchive(bo.isArchive());

        return view;
    }

    public static LotTable lotBoToTable(LotBo bo){
        LotTable table = new LotTable();
        table.setId(bo.getId());
        table.setCodeOeuf(bo.getCodeOeuf());
        table.setBatiment(bo.getBatimentPo().getCodeInterne());
        table.setCategorie(bo.getCategorieBo().getNom());
        table.setCouvoir(bo.getCouvoirBo().getNom());
        table.setSouche(bo.getSoucheBo().getNom());
        table.setAliment(bo.getAlimentBo().getNom());
        table.setNbPoulesMEP(bo.getNbPoulesMEP());
        table.setCoefErosion(bo.getCoefErosion());
        table.setMep(bo.getMep());
        table.setActif(bo.isActif());
        table.setArchive(bo.isArchive());
        table.setCreated(bo.getCreated());
        table.setModified(bo.getModified());

        return table;
    }

    public static LotEntity lotFormToEntity(LotForm form){
        LotBo bo = lotFormToBo(form);

        return lotBoToEntity(bo);
    }

    public static LotView lotEntityToView(LotEntity entity){
        LotBo bo = lotEntityToBo(entity);

        return lotBoToView(bo);
    }

    public static LotTable lotEntityToTable(LotEntity entity){
        LotBo bo = lotEntityToBo(entity);

        return lotBoToTable(bo);
    }
}
