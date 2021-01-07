package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.LotTest;
import com.cocorette.genesis.model.bo.LotBo;
import com.cocorette.genesis.model.entity.LotEntity;
import com.cocorette.genesis.model.form.LotForm;
import com.cocorette.genesis.model.table.LotTable;
import com.cocorette.genesis.model.view.LotView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LotConvertTest {
    private static LotTest lotTest;

    @BeforeAll
    public static void init(){
        lotTest = new LotTest();
    }

    @Test
    public void lotEntityToBo(){
        LotEntity input = lotTest.creerEntity();
        LotBo expected = lotTest.creerBo();

        LotBo result = LotConvert.lotEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getCodeOeuf(), result.getCodeOeuf());
        assertEquals(expected.getDureeProdTheorique(), result.getDureeProdTheorique());
        assertEquals(expected.getDureeProdReelle(), result.getDureeProdReelle());
        assertEquals(expected.getNbPoulesMEP(), result.getNbPoulesMEP());
        assertEquals(expected.getFinLotTheorique(), result.getFinLotTheorique());
        assertEquals(expected.getCoefErosion(), result.getCoefErosion());
        assertEquals(expected.isDernierLot(), result.isDernierLot());
        assertEquals(expected.getNaissancePoules(), result.getNaissancePoules());
        assertEquals(expected.getMep(), result.getMep());
        assertEquals(expected.getFinLot(), result.getFinLot());
        assertEquals(expected.getCommentaires(), result.getCommentaires());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        //TODO batiment, aliment, categorie, couvoir, souche, aliment
    }

    @Test
    public void lotBoToEntity(){
        LotEntity expected = lotTest.creerEntity();
        LotBo input = lotTest.creerBo();

        LotEntity result = LotConvert.lotBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getCodeOeuf(), result.getCodeOeuf());
        assertEquals(expected.getDureeProdTheorique(), result.getDureeProdTheorique());
        assertEquals(expected.getDureeProdReelle(), result.getDureeProdReelle());
        assertEquals(expected.getNbPoulesMEP(), result.getNbPoulesMEP());
        assertEquals(expected.getFinLotTheorique(), result.getFinLotTheorique());
        assertEquals(expected.getCoefErosion(), result.getCoefErosion());
        assertEquals(expected.isDernierLot(), result.isDernierLot());
        assertEquals(expected.getNaissancePoules(), result.getNaissancePoules());
        assertEquals(expected.getMep(), result.getMep());
        assertEquals(expected.getFinLot(), result.getFinLot());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        //TODO batiment, aliment, categorie, couvoir, souche, aliment
    }

    @Test
    public void lotFormToBoTest(){
        LotForm input = lotTest.creerForm();
        LotBo expected = lotTest.creerBo();

        LotBo result = LotConvert.lotFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getCodeOeuf(), result.getCodeOeuf());
        assertEquals(expected.getNbPoulesMEP(), result.getNbPoulesMEP());
        assertEquals(expected.isDernierLot(), result.isDernierLot());
        assertEquals(expected.getNaissancePoules(), result.getNaissancePoules());
        assertEquals(expected.getMep(), result.getMep());
        assertEquals(expected.getCommentaires(), result.getCommentaires());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void lotBoToTable(){
        LotTable expected = lotTest.creerTable();
        LotBo input = lotTest.creerBo();

        LotTable result = LotConvert.lotBoToTable(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getCodeOeuf(), result.getCodeOeuf());
        assertEquals(expected.getInuav(), result.getInuav());
        assertEquals(expected.getCategorie(), result.getCategorie());
        assertEquals(expected.getCouvoir(), result.getCouvoir());
        assertEquals(expected.getSouche(), result.getSouche());
        assertEquals(expected.getAliment(), result.getAliment());
        assertEquals(expected.getNbPoulesMEP(), result.getNbPoulesMEP());
        assertEquals(expected.getCoefErosion(), result.getCoefErosion());
        assertEquals(expected.getMep(), result.getMep());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void lotBoToView(){
        LotView expected = lotTest.creerView();
        LotBo input = lotTest.creerBo();

        LotView result = LotConvert.lotBoToView(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getCodeOeuf(), result.getCodeOeuf());
        assertEquals(expected.getDureeProdTheorique(), result.getDureeProdTheorique());
        assertEquals(expected.getDureeProdReelle(), result.getDureeProdReelle());
        assertEquals(expected.getNbPoulesMEP(), result.getNbPoulesMEP());
        assertEquals(expected.getFinLotTheorique(), result.getFinLotTheorique());
        assertEquals(expected.getCoefErosion(), result.getCoefErosion());
        assertEquals(expected.isDernierLot(), result.isDernierLot());
        assertEquals(expected.getNaissancePoules(), result.getNaissancePoules());
        assertEquals(expected.getMep(), result.getMep());
        assertEquals(expected.getFinLot(), result.getFinLot());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActif(), result.isActif());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
        assertEquals(expected.getBatiment(), result.getBatiment());
        assertEquals(expected.getBatimentId(), result.getBatimentId());
        assertEquals(expected.getCategorie(), result.getCategorie());
        assertEquals(expected.getCouvoirId(), result.getCouvoirId());
        assertEquals(expected.getCouvoir(), result.getCouvoir());
        assertEquals(expected.getSouche(), result.getSouche());
        assertEquals(expected.getSoucheId(), result.getSoucheId());
        assertEquals(expected.getAliment(), result.getAliment());
        assertEquals(expected.getAlimentId(), result.getAlimentId());

    }
}
