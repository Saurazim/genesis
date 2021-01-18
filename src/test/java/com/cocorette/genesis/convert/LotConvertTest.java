package com.cocorette.genesis.convert;

import com.cocorette.genesis.model.*;
import com.cocorette.genesis.model.bo.*;
import com.cocorette.genesis.model.entity.*;
import com.cocorette.genesis.model.form.LotForm;
import com.cocorette.genesis.model.table.LotTable;
import com.cocorette.genesis.model.transitionnel.BatimentPo;
import com.cocorette.genesis.model.view.LotView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.reactivestreams.Publisher;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
public class LotConvertTest {
    @Mock
    BatimentConvert batimentConvert;
    @Mock
    CategorieConvert categorieConvert;
    @Mock
    CouvoirConvert couvoirConvert;
    @Mock
    SoucheConvert soucheConvert;
    @Mock
    AlimentConvert alimentConvert;

    private static LotTest lotTest;
    private static BatimentTest batimentTest;
    private static CategorieTest categorieTest;
    private static CouvoirTest couvoirTest;
    private static SoucheTest soucheTest;
    private static AlimentTest alimentTest;

    @BeforeAll
    public static void init(){
        lotTest = new LotTest();
        batimentTest = new BatimentTest();
        categorieTest = new CategorieTest();
        couvoirTest = new CouvoirTest();
        soucheTest = new SoucheTest();
        alimentTest = new AlimentTest();
    }

    @Test
    public void lotEntityToBo(){
        BatimentEntity batimentEntity = batimentTest.creerEntity();
        BatimentPo batimentPo = batimentTest.creerPo();

        CategorieEntity categorieEntity = categorieTest.creerEntity();
        CategorieBo categorieBo = categorieTest.creerBo();

        CouvoirEntity couvoirEntity = couvoirTest.creerEntity();
        CouvoirBo couvoirBo = couvoirTest.creerBo();

        SoucheEntity soucheEntity = soucheTest.creerEntity();
        SoucheBo soucheBo = soucheTest.creerBo();

        AlimentEntity alimentEntity = alimentTest.creerEntity();
        AlimentBo alimentBo = alimentTest.creerBo();

        LotEntity input = lotTest.creerEntity();
        input.setBatimentEntity(batimentEntity);
        input.setCategorieEntity(categorieEntity);
        input.setCouvoirEntity(couvoirEntity);
        input.setSoucheEntity(soucheEntity);
        input.setAlimentEntity(alimentEntity);
        LotBo expected = lotTest.creerBo();

        when(batimentConvert.batimentEntityToPo(input.getBatimentEntity())).thenReturn(batimentPo);
        when(categorieConvert.categorieEntityToBo(input.getCategorieEntity())).thenReturn(categorieBo);
        when(couvoirConvert.couvoirEntityToBo(input.getCouvoirEntity())).thenReturn(couvoirBo);
        when(soucheConvert.soucheEntityToBo(input.getSoucheEntity())).thenReturn(soucheBo);
        when(alimentConvert.alimentEntityToBo(input.getAlimentEntity())).thenReturn(alimentBo);
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
        verify(batimentConvert).batimentEntityToBo(input.getBatimentEntity());
        verify(categorieConvert).categorieEntityToBo(input.getCategorieEntity());
        verify(couvoirConvert).couvoirEntityToBo(input.getCouvoirEntity());
        verify(soucheConvert).soucheEntityToBo(input.getSoucheEntity());
        verify(alimentConvert).alimentEntityToBo(input.getAlimentEntity());

    }

    @Test
    public void lotBoToEntity(){
        BatimentEntity batimentEntity = batimentTest.creerEntity();
        BatimentPo batimentPo = batimentTest.creerPo();

        CategorieEntity categorieEntity = categorieTest.creerEntity();
        CategorieBo categorieBo = categorieTest.creerBo();

        CouvoirEntity couvoirEntity = couvoirTest.creerEntity();
        CouvoirBo couvoirBo = couvoirTest.creerBo();

        SoucheEntity soucheEntity = soucheTest.creerEntity();
        SoucheBo soucheBo = soucheTest.creerBo();

        AlimentEntity alimentEntity = alimentTest.creerEntity();
        AlimentBo alimentBo = alimentTest.creerBo();

        LotEntity expected = lotTest.creerEntity();
        LotBo input = lotTest.creerBo();
        input.setBatimentPo(batimentPo);
        input.setCategorieBo(categorieBo);
        input.setCouvoirBo(couvoirBo);
        input.setSoucheBo(soucheBo);
        input.setAlimentBo(alimentBo);

        when(batimentConvert.batimentPoToEntity(input.getBatimentPo())).thenReturn(batimentEntity);
        when(categorieConvert.categorieBoToEntity(input.getCategorieBo())).thenReturn(categorieEntity);
        when(couvoirConvert.couvoirBoToEntity(input.getCouvoirBo())).thenReturn(couvoirEntity);
        when(soucheConvert.soucheBoToEntity(input.getSoucheBo())).thenReturn(soucheEntity);
        when(alimentConvert.alimentBoToEntity(input.getAlimentBo())).thenReturn(alimentEntity);

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
        verify(batimentConvert).batimentPoToEntity(input.getBatimentPo());
        verify(categorieConvert).categorieBoToEntity(input.getCategorieBo());
        verify(couvoirConvert).couvoirBoToEntity(input.getCouvoirBo());
        verify(soucheConvert).soucheBoToEntity(input.getSoucheBo());
        verify(alimentConvert).alimentBoToEntity(input.getAlimentBo());
    }

    @Test
    public void lotFormToBoTest(){
        BatimentPo batimentPo = batimentTest.creerPo();
        CategorieBo categorieBo = categorieTest.creerBo();
        CouvoirBo couvoirBo = couvoirTest.creerBo();
        SoucheBo soucheBo = soucheTest.creerBo();
        AlimentBo alimentBo = alimentTest.creerBo();

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
        assertEquals(batimentPo.getId(), result.getBatimentPo().getId());
        assertEquals(batimentPo.getInuav(), result.getBatimentPo().getInuav());
        assertEquals(categorieBo.getId(), result.getCategorieBo().getId());
        assertEquals(categorieBo.getNom(), result.getCategorieBo().getNom());
        assertEquals(couvoirBo.getId(), result.getCouvoirBo().getId());
        assertEquals(couvoirBo.getNom(), result.getCouvoirBo().getNom());
        assertEquals(soucheBo.getId(), result.getSoucheBo().getId());
        assertEquals(soucheBo.getNom(), result.getSoucheBo().getNom());
        assertEquals(alimentBo.getId(), result.getAlimentBo().getId());
        assertEquals(alimentBo.getNom(), result.getAlimentBo().getNom());

    }

    @Test
    public void lotBoToTable(){
        BatimentPo batimentPo = batimentTest.creerPo();
        CategorieBo categorieBo = categorieTest.creerBo();
        CouvoirBo couvoirBo = couvoirTest.creerBo();
        SoucheBo soucheBo = soucheTest.creerBo();
        AlimentBo alimentBo = alimentTest.creerBo();

        LotTable expected = lotTest.creerTable();
        LotBo input = lotTest.creerBo();
        input.setBatimentPo(batimentPo);
        input.setCategorieBo(categorieBo);
        input.setCouvoirBo(couvoirBo);
        input.setSoucheBo(soucheBo);
        input.setAlimentBo(alimentBo);

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
        BatimentPo batimentPo = batimentTest.creerPo();
        CategorieBo categorieBo = categorieTest.creerBo();
        CouvoirBo couvoirBo = couvoirTest.creerBo();
        SoucheBo soucheBo = soucheTest.creerBo();
        AlimentBo alimentBo = alimentTest.creerBo();

        LotView expected = lotTest.creerView();
        LotBo input = lotTest.creerBo();
        input.setBatimentPo(batimentPo);
        input.setCategorieBo(categorieBo);
        input.setCouvoirBo(couvoirBo);
        input.setSoucheBo(soucheBo);
        input.setAlimentBo(alimentBo);

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
