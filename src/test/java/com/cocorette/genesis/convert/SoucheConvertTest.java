package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;

import com.cocorette.genesis.model.SoucheTest;
import com.cocorette.genesis.model.bo.SoucheBo;
import com.cocorette.genesis.model.entity.SoucheEntity;
import com.cocorette.genesis.model.form.SoucheForm;
import com.cocorette.genesis.model.table.SoucheTable;
import com.cocorette.genesis.model.view.SoucheView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SoucheConvertTest {
    private static SoucheTest soucheTest;

    @BeforeAll
    public static void init(){
        soucheTest = new SoucheTest();
    }

    @Test
    public void soucheEntityToBoTest(){
        SoucheEntity input = soucheTest.creerEntity();
        SoucheBo expected = soucheTest.creerBo();

        SoucheBo result = SoucheConvert.soucheEntityToBo(input);

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
    public void soucheBoToEntityTest(){
        SoucheEntity expected = soucheTest.creerEntity();
        SoucheBo input = soucheTest.creerBo();

        SoucheEntity result = SoucheConvert.soucheBoToEntity(input);

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
    public void soucheFormToBoTest(){
        SoucheForm input = soucheTest.creerForm();
        SoucheBo expected = soucheTest.creerBo();

        SoucheBo result = SoucheConvert.soucheFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
    }

    @Test
    public void soucheBoToTableTest(){
        SoucheBo input = soucheTest.creerBo();
        SoucheTable expected = soucheTest.creerTable();

        SoucheTable result = SoucheConvert.soucheBoToTable(input);

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
    public void soucheBoToViewTest(){
        SoucheBo input = soucheTest.creerBo();
        SoucheView expected = soucheTest.creerView();

        SoucheView result = SoucheConvert.soucheBoToView(input);

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
