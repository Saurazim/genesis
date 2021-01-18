package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;

import com.cocorette.genesis.model.CouvoirTest;
import com.cocorette.genesis.model.bo.CouvoirBo;
import com.cocorette.genesis.model.entity.CouvoirEntity;
import com.cocorette.genesis.model.form.CouvoirForm;
import com.cocorette.genesis.model.table.CouvoirTable;
import com.cocorette.genesis.model.view.CouvoirView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CouvoirConvertTest {
    private static CouvoirTest couvoirTest;

    @BeforeAll
    private static void init(){
        couvoirTest = new CouvoirTest();
    }

    @Test
    public void couvoirEntityToBoTest(){
        CouvoirEntity input = couvoirTest.creerEntity();
        CouvoirBo expected = couvoirTest.creerBo();

        CouvoirBo result = CouvoirConvert.couvoirEntityToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void couvoirBoToEntityTest(){
        CouvoirEntity expected = couvoirTest.creerEntity();
        CouvoirBo input = couvoirTest.creerBo();

        CouvoirEntity result = CouvoirConvert.couvoirBoToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void couvoirFormToBoTest(){
        CouvoirForm input = couvoirTest.creerForm();
        CouvoirBo expected = couvoirTest.creerBo();

         CouvoirBo result = CouvoirConvert.couvoirFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
    }

    @Test
    public void couvoirBoToViewTest(){
        CouvoirBo input = couvoirTest.creerBo();
        CouvoirView expected = couvoirTest.creerView();

        CouvoirView result = CouvoirConvert.couvoirBoToView(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }

    @Test
    public void couvoirBoToTable(){
        CouvoirBo input = couvoirTest.creerBo();
        CouvoirTable expected = couvoirTest.creerTable();

        CouvoirTable result = CouvoirConvert.couvoirBoToTable(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getId(), result.getId());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
        assertEquals(expected.isActive(), result.isActive());
        assertEquals(expected.isArchive(), result.isArchive());
        assertEquals(expected.getCreated(), result.getCreated());
        assertEquals(expected.getModified(), result.getModified());
    }
}
