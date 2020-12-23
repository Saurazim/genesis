package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;

import com.cocorette.genesis.model.AlimentTest;
import com.cocorette.genesis.model.bo.AlimentBo;
import com.cocorette.genesis.model.entity.AlimentEntity;
import com.cocorette.genesis.model.form.AlimentForm;
import com.cocorette.genesis.model.table.AlimentTable;
import com.cocorette.genesis.model.view.AlimentView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AlimentConvertTest {
    private static AlimentTest alimentTest;

    @BeforeAll
    public static void init(){
        alimentTest = new AlimentTest();
    }

    @Test
    void alimentEntityToBoTest(){
        AlimentEntity input = alimentTest.creerEntity();
        AlimentBo expected = alimentTest.creerBo();

        AlimentBo result = AlimentConvert.alimentEntityToBo(input);

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
    void alimentBoToEntityTest(){
        AlimentEntity expected = alimentTest.creerEntity();
        AlimentBo input = alimentTest.creerBo();

        AlimentEntity result = AlimentConvert.alimentBoToEntity(input);

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
    void alimentFormToBoTest(){
        AlimentForm input = alimentTest.creerForm();
        AlimentBo expected = alimentTest.creerBo();

        AlimentBo result = AlimentConvert.alimentFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
    }

    @Test
    void alimentBoToViewTest(){
        AlimentView expected = alimentTest.creerView();
        AlimentBo input = alimentTest.creerBo();

        AlimentView result = AlimentConvert.alimentBoToView(input);

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
    void alimentBoToTableTest(){
        AlimentTable expected = alimentTest.creerTable();
        AlimentBo input = alimentTest.creerBo();

        AlimentTable result = AlimentConvert.alimentBoToTable(input);

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
    void alimentFormToEntityTest(){
        AlimentEntity expected = alimentTest.creerEntity();
        AlimentForm input = alimentTest.creerForm();

        AlimentEntity result = AlimentConvert.alimentFormToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
    }

    @Test
    void alimentEntityToViewTest(){
        AlimentEntity input = alimentTest.creerEntity();
        AlimentView expected = alimentTest.creerView();

        AlimentView result = AlimentConvert.alimentEntityToView(input);

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
    void alimentEntityToTableTest(){
        AlimentEntity input = alimentTest.creerEntity();
        AlimentTable expected = alimentTest.creerTable();

        AlimentTable result = AlimentConvert.alimentEntityToTable(input);

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
