package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.bo.LotBo;
import com.cocorette.genesis.model.entity.LotEntity;
import com.cocorette.genesis.model.form.LotForm;
import com.cocorette.genesis.model.table.LotTable;
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
        bo.setAnalyse1(entity.getAnalyse1());
        bo.setAnalyse2(entity.getAnalyse2());
        bo.setPrelevement1(entity.getPrelevement1());
        bo.setPrelevement2(entity.getPrelevement2());
        bo.setPrelevement3(entity.getPrelevement3());
        bo.setPrelevement4(entity.getPrelevement4());

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
        entity.setAnalyse1(bo.getAnalyse1());
        entity.setAnalyse2(bo.getAnalyse2());
        entity.setPrelevement1(bo.getPrelevement1());
        entity.setPrelevement2(bo.getPrelevement2());
        entity.setPrelevement3(bo.getPrelevement3());
        entity.setPrelevement4(bo.getPrelevement4());

        return entity;
    }

    public static LotBo lotFormToBo(LotForm form){
        LotBo bo = new LotBo();
        bo.setCodeOeuf(form.getCodeOeuf());
        bo.setDureeProdTheorique(form.getDureeProdTheorique());
        bo.setBatimentPo(form.getBatimentId());
        bo.setCategorieBo(form.getCategorieId());
        bo.setCouvoirBo(form.getCouvoirId());
        bo.setSoucheBo(form.getSoucheId());
        bo.setAlimentBo(form.getAlimentId());
        bo.setNbPoulesMEP(form.getNbPoulesMEP());
        bo.setFinLotTheorique(form.getFinLotTheorique());
        bo.setDernierLot(form.isDernierLot());
        bo.setNaissancePoules(form.getNaissancePoules());
        bo.setMep(form.getMep());

        return bo;
    }

    public static LotView lotBoToView(LotBo bo){
        LotView view = new LotView();
        view.setCodeOeuf(bo.getCodeOeuf());
        view.setBatiment(bo.getBatimentPo().getInuav());
        view.setBatimentId(bo.getBatimentPo().getId());
        view.setCategorie(bo.getCategorieBo().getNom());
        view.setCouvoir(bo.getCouvoirBo().getNom());
        view.setSouche(bo.getSoucheBo().getNom());
        view.setAliment(bo.getAlimentBo().getNom());
        view.setDureeProdTheorique(bo.getDureeProdTheorique());
        view.setDureeProdReelle(bo.getDureeProdReelle());
        view.setNbPoulesMEP(bo.getNbPoulesMEP());
        view.setFinLotTheorique(bo.getFinLotTheorique());
        view.setCoefErosion(bo.getCoefErosion());
        view.setDernierLot(bo.isDernierLot());
        view.setNaissancePoules(bo.getNaissancePoules());
        view.setMep(bo.getMep());
        view.setFinLot(bo.getFinLot());
        view.setAnalyse1(bo.getAnalyse1());
        view.setAnalyse2(bo.getAnalyse2());
        view.setPrelevement1(bo.getPrelevement1());
        view.setPrelevement2(bo.getPrelevement2());
        view.setPrelevement3(bo.getPrelevement3());
        view.setPrelevement4(bo.getPrelevement4());

        return view;
    }

    public static LotTable lotBoToTable(LotBo bo){
        LotTable table = new LotTable();
        table.setId(bo.getId());
        table.setCodeOeuf(bo.getCodeOeuf());
        table.setInuav(bo.getBatimentPo().getInuav());
        table.setCategorie(bo.getCategorieBo().getNom());
        table.setCouvoir(bo.getCouvoirBo().getNom());
        table.setSouche(bo.getSoucheBo().getNom());
        table.setAliment(bo.getAlimentBo().getNom());
        table.setNbPoulesMEP(bo.getNbPoulesMEP());
        table.setCoefErosion(bo.getCoefErosion());
        table.setMep(bo.getMep());

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
