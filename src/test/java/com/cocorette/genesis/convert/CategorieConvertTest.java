package com.cocorette.genesis.convert;

import static org.junit.jupiter.api.Assertions.*;

import com.cocorette.genesis.model.CategorieTest;
import com.cocorette.genesis.model.bo.CategorieBo;
import com.cocorette.genesis.model.entity.CategorieEntity;
import com.cocorette.genesis.model.form.CategorieForm;
import com.cocorette.genesis.model.table.CategorieTable;
import com.cocorette.genesis.model.view.CategorieView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CategorieConvertTest {
    private static CategorieTest categorieTest;

    @BeforeAll
    public static void init(){
        categorieTest = new CategorieTest();
    }

    @Test
    public void categorieEntityToBoTest(){
        CategorieEntity input = categorieTest.creerEntity();
        CategorieBo expected = categorieTest.creerBo();

        CategorieBo result = CategorieConvert.categorieEntityToBo(input);

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
    public void categorieBoToEntityTest(){
        CategorieEntity expected = categorieTest.creerEntity();
        CategorieBo input = categorieTest.creerBo();

        CategorieEntity result = CategorieConvert.categorieBoToEntity(input);

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
    public void categorieFormToBoTest(){
        CategorieBo expected = categorieTest.creerBo();
        CategorieForm input = categorieTest.creerForm();

        CategorieBo result = CategorieConvert.categorieFormToBo(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());

    }

    @Test
    public void categorieBoToViewTest(){
        CategorieView expected = categorieTest.creerView();
        CategorieBo input = categorieTest.creerBo();

        CategorieView result = CategorieConvert.categorieBoToView(input);

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
    public void categorieBoToTableTest(){
        CategorieTable expected = categorieTest.creerTable();
        CategorieBo input = categorieTest.creerBo();

        CategorieTable result = CategorieConvert.categorieBoToTable(input);

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
    public void categorieFormToEntityTest(){
        CategorieEntity expected = categorieTest.creerEntity();
        CategorieForm input = categorieTest.creerForm();

        CategorieEntity result = CategorieConvert.categorieFormToEntity(input);

        assertEquals(expected.getClass(), result.getClass());
        assertEquals(expected.getNom(), result.getNom());
        assertEquals(expected.getCommentaire(), result.getCommentaire());
    }

    @Test
    public void categorieEntityToViewTest(){
        CategorieView expected = categorieTest.creerView();
        CategorieEntity input = categorieTest.creerEntity();

        CategorieView result = CategorieConvert.categorieEntityToView(input);

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
    public void categorieEntityToTableTest(){
        CategorieTable expected = categorieTest.creerTable();
        CategorieEntity input = categorieTest.creerEntity();

        CategorieTable result = CategorieConvert.categorieEntityToTable(input);

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
